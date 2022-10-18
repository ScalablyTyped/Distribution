package typings.plottable

import typings.lodash.mod.MemoizedFunction
import typings.plottable.anon.MaximumExtents
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcUtilsMod.Map
import typings.plottable.plottableStrings.bottomup
import typings.plottable.plottableStrings.topdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsStackingUtilsMod {
  
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
    inline def bottomup_=(x: bottomup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomup")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/utils/stackingUtils", "IStackingOrder.topdown")
    @js.native
    def topdown: typings.plottable.plottableStrings.topdown = js.native
    inline def topdown_=(x: topdown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topdown")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/utils/stackingUtils", "normalizeKey")
  @js.native
  val normalizeKey: (js.Function1[/* key */ Any, String]) & MemoizedFunction = js.native
  
  inline def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[Any], valueAccessor: IAccessor[Double]): StackingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], valueAccessor.asInstanceOf[js.Any])).asInstanceOf[StackingResult]
  inline def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[Any],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], valueAccessor.asInstanceOf[js.Any], stackingOrder.asInstanceOf[js.Any])).asInstanceOf[StackingResult]
  
  inline def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[Any], filter: IAccessor[Boolean]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackedExtent")(stackingResult.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedExtents")(stackingResult.asInstanceOf[js.Any]).asInstanceOf[MaximumExtents[D]]
  
  trait GenericStackedDatum[D] extends StObject {
    
    var axisValue: D
    
    var offset: Double
    
    var originalDataset: Dataset
    
    var originalDatum: Any
    
    var originalIndex: Double
    
    var value: Double
  }
  object GenericStackedDatum {
    
    inline def apply[D](
      axisValue: D,
      offset: Double,
      originalDataset: Dataset,
      originalDatum: Any,
      originalIndex: Double,
      value: Double
    ): GenericStackedDatum[D] = {
      val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalDataset = originalDataset.asInstanceOf[js.Any], originalDatum = originalDatum.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericStackedDatum[D]]
    }
    
    extension [Self <: GenericStackedDatum[?], D](x: Self & GenericStackedDatum[D]) {
      
      inline def setAxisValue(value: D): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOriginalDataset(value: Dataset): Self = StObject.set(x, "originalDataset", value.asInstanceOf[js.Any])
      
      inline def setOriginalDatum(value: Any): Self = StObject.set(x, "originalDatum", value.asInstanceOf[js.Any])
      
      inline def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GenericStackingResult[D] = Map[Dataset, Map[String | Double, GenericStackedDatum[D]]]
  
  trait StackExtent[D] extends StObject {
    
    var axisValue: D
    
    var extent: Double
    
    var stackedDatum: GenericStackedDatum[D]
  }
  object StackExtent {
    
    inline def apply[D](axisValue: D, extent: Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
      val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], stackedDatum = stackedDatum.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackExtent[D]]
    }
    
    extension [Self <: StackExtent[?], D](x: Self & StackExtent[D]) {
      
      inline def setAxisValue(value: D): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
      
      inline def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setStackedDatum(value: GenericStackedDatum[D]): Self = StObject.set(x, "stackedDatum", value.asInstanceOf[js.Any])
    }
  }
  
  type StackedDatum = GenericStackedDatum[String]
  
  type StackingResult = GenericStackingResult[String]
}
