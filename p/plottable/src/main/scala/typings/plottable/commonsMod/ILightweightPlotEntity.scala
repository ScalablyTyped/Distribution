package typings.plottable.commonsMod

import typings.plottable.datasetMod.Dataset
import typings.plottable.drawerMod.IDrawer
import typings.plottable.interfacesMod.Point
import typings.plottable.plotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightweightPlotEntity extends js.Object {
  
  var component: Plot = js.native
  
  var dataset: Dataset = js.native
  
  var datasetIndex: Double = js.native
  
  var datum: js.Any = js.native
  
  var drawer: IDrawer = js.native
  
  var index: Double = js.native
  
  var position: Point = js.native
  
  var validDatumIndex: Double = js.native
}
object ILightweightPlotEntity {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ILightweightPlotEntityOps[Self <: ILightweightPlotEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: Plot): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatum(value: js.Any): Self = this.set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawer(value: IDrawer): Self = this.set("drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidDatumIndex(value: Double): Self = this.set("validDatumIndex", value.asInstanceOf[js.Any])
  }
}
