package typings.phaser.Phaser.Types.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinCosTable extends js.Object {
  
  /**
    * The cosine value.
    */
  var cos: Double = js.native
  
  /**
    * The length.
    */
  var length: Double = js.native
  
  /**
    * The sine value.
    */
  var sin: Double = js.native
}
object SinCosTable {
  
  @scala.inline
  def apply(cos: Double, length: Double, sin: Double): SinCosTable = {
    val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinCosTable]
  }
  
  @scala.inline
  implicit class SinCosTableOps[Self <: SinCosTable] (val x: Self) extends AnyVal {
    
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
    def setCos(value: Double): Self = this.set("cos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSin(value: Double): Self = this.set("sin", value.asInstanceOf[js.Any])
  }
}
