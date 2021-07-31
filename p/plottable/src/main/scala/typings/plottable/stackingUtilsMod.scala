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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackingUtilsMod {
  
  @JSImport("plottable/build/src/utils/stackingUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) & MemoizedFunction = js.native
  
  @scala.inline
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[js.Any], valueAccessor: IAccessor[Double]): StackingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], valueAccessor.asInstanceOf[js.Any])).asInstanceOf[StackingResult]
  @scala.inline
  def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[js.Any],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], valueAccessor.asInstanceOf[js.Any], stackingOrder.asInstanceOf[js.Any])).asInstanceOf[StackingResult]
  
  @scala.inline
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[js.Any], filter: IAccessor[Boolean]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackedExtent")(stackingResult.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedExtents")(stackingResult.asInstanceOf[js.Any]).asInstanceOf[MaximumExtents[D]]
  
  trait GenericStackedDatum[D] extends StObject {
    
    var axisValue: D
    
    var offset: Double
    
    var originalDataset: Dataset
    
    var originalDatum: js.Any
    
    var originalIndex: Double
    
    var value: Double
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
    implicit class GenericStackedDatumMutableBuilder[Self <: GenericStackedDatum[?], D] (val x: Self & GenericStackedDatum[D]) extends AnyVal {
      
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
  
  trait StackExtent[D] extends StObject {
    
    var axisValue: D
    
    var extent: Double
    
    var stackedDatum: GenericStackedDatum[D]
  }
  object StackExtent {
    
    @scala.inline
    def apply[D](axisValue: D, extent: Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
      val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], stackedDatum = stackedDatum.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackExtent[D]]
    }
    
    @scala.inline
    implicit class StackExtentMutableBuilder[Self <: StackExtent[?], D] (val x: Self & StackExtent[D]) extends AnyVal {
      
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
