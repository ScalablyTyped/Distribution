package typings.plottable

import typings.lodash.mod.MemoizedFunction
import typings.plottable.anon.MaximumExtents
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.plottableStrings.bottomup
import typings.plottable.plottableStrings.topdown
import typings.plottable.utilsMod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackingUtilsMod {
  
  /* keyof plottable.anon.Bottomup */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.topdown
    - typings.plottable.plottableStrings.bottomup
  */
  trait IStackingOrder extends StObject
  object IStackingOrder {
    
    @JSImport("plottable/build/src/utils/stackingUtils", "IStackingOrder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/utils/stackingUtils", "IStackingOrder.bottomup")
    @js.native
    def bottomup: typings.plottable.plottableStrings.bottomup = js.native
    @scala.inline
    def bottomup_=(x: bottomup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomup")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/utils/stackingUtils", "IStackingOrder.topdown")
    @js.native
    def topdown: typings.plottable.plottableStrings.topdown = js.native
    @scala.inline
    def topdown_=(x: topdown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topdown")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/utils/stackingUtils", "normalizeKey")
  @js.native
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
  
  @JSImport("plottable/build/src/utils/stackingUtils", "stack")
  @js.native
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  @JSImport("plottable/build/src/utils/stackingUtils", "stack")
  @js.native
  def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  
  @JSImport("plottable/build/src/utils/stackingUtils", "stackedExtent")
  @js.native
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
  
  @JSImport("plottable/build/src/utils/stackingUtils", "stackedExtents")
  @js.native
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = js.native
  
  @js.native
  trait GenericStackedDatum[D] extends StObject {
    
    var axisValue: D = js.native
    
    var offset: Double = js.native
    
    var originalDataset: Dataset = js.native
    
    var originalDatum: js.Any = js.native
    
    var originalIndex: Double = js.native
    
    var value: Double = js.native
  }
  object GenericStackedDatum {
    
    @scala.inline
    def apply[D](
      axisValue: D,
      offset: Double,
      originalDataset: Dataset,
      originalDatum: js.Any,
      originalIndex: Double,
      value: Double
    ): GenericStackedDatum[D] = {
      val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalDataset = originalDataset.asInstanceOf[js.Any], originalDatum = originalDatum.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericStackedDatum[D]]
    }
    
    @scala.inline
    implicit class GenericStackedDatumMutableBuilder[Self <: GenericStackedDatum[_], D] (val x: Self with GenericStackedDatum[D]) extends AnyVal {
      
      @scala.inline
      def setAxisValue(value: D): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalDataset(value: Dataset): Self = StObject.set(x, "originalDataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalDatum(value: js.Any): Self = StObject.set(x, "originalDatum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GenericStackingResult[D] = Map[Dataset, Map[String | Double, GenericStackedDatum[D]]]
  
  @js.native
  trait StackExtent[D] extends StObject {
    
    var axisValue: D = js.native
    
    var extent: Double = js.native
    
    var stackedDatum: GenericStackedDatum[D] = js.native
  }
  object StackExtent {
    
    @scala.inline
    def apply[D](axisValue: D, extent: Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
      val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], stackedDatum = stackedDatum.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackExtent[D]]
    }
    
    @scala.inline
    implicit class StackExtentMutableBuilder[Self <: StackExtent[_], D] (val x: Self with StackExtent[D]) extends AnyVal {
      
      @scala.inline
      def setAxisValue(value: D): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedDatum(value: GenericStackedDatum[D]): Self = StObject.set(x, "stackedDatum", value.asInstanceOf[js.Any])
    }
  }
  
  type StackedDatum = GenericStackedDatum[String]
  
  type StackingResult = GenericStackingResult[String]
}
