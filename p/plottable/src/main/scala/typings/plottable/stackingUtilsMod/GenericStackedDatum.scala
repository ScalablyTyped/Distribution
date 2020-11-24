package typings.plottable.stackingUtilsMod

import typings.plottable.datasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericStackedDatum[D] extends js.Object {
  
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
  implicit class GenericStackedDatumOps[Self <: GenericStackedDatum[_], D] (val x: Self with GenericStackedDatum[D]) extends AnyVal {
    
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
    def setAxisValue(value: D): Self = this.set("axisValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDataset(value: Dataset): Self = this.set("originalDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDatum(value: js.Any): Self = this.set("originalDatum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalIndex(value: Double): Self = this.set("originalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
