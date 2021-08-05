package typings.plottable

import typings.plottable.datasetMod.Dataset
import typings.plottable.drawerMod.IDrawer
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.IEntity
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.IRangeProjector
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.plotMod.Plot
import typings.plottable.scaleMod.Scale
import typings.plottable.scaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonsMod {
  
  object Animator {
    
    @JSImport("plottable/build/src/plots/commons", "Animator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/commons", "Animator.MAIN")
    @js.native
    def MAIN: String = js.native
    inline def MAIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/commons", "Animator.RESET")
    @js.native
    def RESET: String = js.native
    inline def RESET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESET")(x.asInstanceOf[js.Any])
  }
  
  trait IAccessorScaleBinding[D, R] extends StObject {
    
    /**
      * The (possibly upcasted to a function) user defined accessor.
      *
      * The first argument in `plot.x((d) => d.x, scale)`.
      */
    def accessor(datum: js.Any, index: Double, dataset: Dataset): js.Any
    /**
      * The (possibly upcasted to a function) user defined accessor.
      *
      * The first argument in `plot.x((d) => d.x, scale)`.
      */
    @JSName("accessor")
    var accessor_Original: IAccessor[js.Any]
    
    /**
      * Transforms the scaled result of the accessor.
      *
      * Normally, the accessors ,`(d) => d.x`, will be wrapped like
      * `scale.scale((d) => d.x)`. But, this is not sufficient if you want to
      * modify the scaled value.
      *
      * However, moving the scale inside the accessor prevents several useful
      * features from working properly (including `computeExtents`, `entityNearest`
      * and `deferredRendering`). So, you may optionally provide this projector
      * which, if present, will be applied to the scaled accessor result.
      * */
    var postScale: js.UndefOr[IRangeProjector[R]] = js.undefined
    
    /**
      * The Scale that the accessor's result gets passed through.
      *
      * The second argument in `plot.x((d) => d.x, scale)`.
      */
    var scale: js.UndefOr[Scale[D, R]] = js.undefined
  }
  object IAccessorScaleBinding {
    
    inline def apply[D, R](accessor: (/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset) => js.Any): IAccessorScaleBinding[D, R] = {
      val __obj = js.Dynamic.literal(accessor = js.Any.fromFunction3(accessor))
      __obj.asInstanceOf[IAccessorScaleBinding[D, R]]
    }
    
    extension [Self <: IAccessorScaleBinding[?, ?], D, R](x: Self & (IAccessorScaleBinding[D, R])) {
      
      inline def setAccessor(value: (/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction3(value))
      
      inline def setPostScale(value: (R, /* datum */ js.Any, /* index */ Double, /* dataset */ Dataset) => R): Self = StObject.set(x, "postScale", js.Any.fromFunction4(value))
      
      inline def setPostScaleUndefined: Self = StObject.set(x, "postScale", js.undefined)
      
      inline def setScale(value: Scale[D, R]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  trait ILightweightPlotEntity extends StObject {
    
    var component: Plot
    
    var dataset: Dataset
    
    var datasetIndex: Double
    
    var datum: js.Any
    
    var drawer: IDrawer
    
    var index: Double
    
    var position: Point
    
    var validDatumIndex: Double
  }
  object ILightweightPlotEntity {
    
    inline def apply(
      component: Plot,
      dataset: Dataset,
      datasetIndex: Double,
      datum: js.Any,
      drawer: IDrawer,
      index: Double,
      position: Point,
      validDatumIndex: Double
    ): ILightweightPlotEntity = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], validDatumIndex = validDatumIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILightweightPlotEntity]
    }
    
    extension [Self <: ILightweightPlotEntity](x: Self) {
      
      inline def setComponent(value: Plot): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: js.Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDrawer(value: IDrawer): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setValidDatumIndex(value: Double): Self = StObject.set(x, "validDatumIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlotEntity
    extends StObject
       with IEntity[Plot] {
    
    var dataset: Dataset
    
    var datasetIndex: Double
    
    var index: Double
  }
  object IPlotEntity {
    
    inline def apply(
      bounds: IEntityBounds,
      component: Plot,
      dataset: Dataset,
      datasetIndex: Double,
      datum: js.Any,
      index: Double,
      position: Point,
      selection: SimpleSelection[js.Any]
    ): IPlotEntity = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlotEntity]
    }
    
    extension [Self <: IPlotEntity](x: Self) {
      
      inline def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITransformableAccessorScaleBinding[D, R] extends StObject {
    
    def accessor(datum: js.Any, index: Double, dataset: Dataset): js.Any
    @JSName("accessor")
    var accessor_Original: IAccessor[js.Any]
    
    var postScale: js.UndefOr[IRangeProjector[R]] = js.undefined
    
    var scale: js.UndefOr[TransformableScale[D, R]] = js.undefined
  }
  object ITransformableAccessorScaleBinding {
    
    inline def apply[D, R](accessor: (/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset) => js.Any): ITransformableAccessorScaleBinding[D, R] = {
      val __obj = js.Dynamic.literal(accessor = js.Any.fromFunction3(accessor))
      __obj.asInstanceOf[ITransformableAccessorScaleBinding[D, R]]
    }
    
    extension [Self <: ITransformableAccessorScaleBinding[?, ?], D, R](x: Self & (ITransformableAccessorScaleBinding[D, R])) {
      
      inline def setAccessor(value: (/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset) => js.Any): Self = StObject.set(x, "accessor", js.Any.fromFunction3(value))
      
      inline def setPostScale(value: (R, /* datum */ js.Any, /* index */ Double, /* dataset */ Dataset) => R): Self = StObject.set(x, "postScale", js.Any.fromFunction4(value))
      
      inline def setPostScaleUndefined: Self = StObject.set(x, "postScale", js.undefined)
      
      inline def setScale(value: TransformableScale[D, R]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
