package typings.phaser.Phaser.Types.Create

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Palette extends js.Object {
  /**
    * Color value 1.
    */
  var `0`: String = js.native
  /**
    * Color value 2.
    */
  var `1`: String = js.native
  /**
    * Color value 3.
    */
  var `2`: String = js.native
  /**
    * Color value 4.
    */
  var `3`: String = js.native
  /**
    * Color value 5.
    */
  var `4`: String = js.native
  /**
    * Color value 6.
    */
  var `5`: String = js.native
  /**
    * Color value 7.
    */
  var `6`: String = js.native
  /**
    * Color value 8.
    */
  var `7`: String = js.native
  /**
    * Color value 9.
    */
  var `8`: String = js.native
  /**
    * Color value 10.
    */
  var `9`: String = js.native
  /**
    * Color value 11.
    */
  var A: String = js.native
  /**
    * Color value 12.
    */
  var B: String = js.native
  /**
    * Color value 13.
    */
  var C: String = js.native
  /**
    * Color value 14.
    */
  var D: String = js.native
  /**
    * Color value 15.
    */
  var E: String = js.native
  /**
    * Color value 16.
    */
  var F: String = js.native
}

object Palette {
  @scala.inline
  def apply(
    `0`: String,
    `1`: String,
    `2`: String,
    `3`: String,
    `4`: String,
    `5`: String,
    `6`: String,
    `7`: String,
    `8`: String,
    `9`: String,
    A: String,
    B: String,
    C: String,
    D: String,
    E: String,
    F: String
  ): Palette = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Palette]
  }
  @scala.inline
  implicit class PaletteOps[Self <: Palette] (val x: Self) extends AnyVal {
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
    def set0(value: String): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def set2(value: String): Self = this.set("2", value.asInstanceOf[js.Any])
    @scala.inline
    def set3(value: String): Self = this.set("3", value.asInstanceOf[js.Any])
    @scala.inline
    def set4(value: String): Self = this.set("4", value.asInstanceOf[js.Any])
    @scala.inline
    def set5(value: String): Self = this.set("5", value.asInstanceOf[js.Any])
    @scala.inline
    def set6(value: String): Self = this.set("6", value.asInstanceOf[js.Any])
    @scala.inline
    def set7(value: String): Self = this.set("7", value.asInstanceOf[js.Any])
    @scala.inline
    def set8(value: String): Self = this.set("8", value.asInstanceOf[js.Any])
    @scala.inline
    def set9(value: String): Self = this.set("9", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: String): Self = this.set("A", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: String): Self = this.set("B", value.asInstanceOf[js.Any])
    @scala.inline
    def setC(value: String): Self = this.set("C", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: String): Self = this.set("D", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: String): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: String): Self = this.set("F", value.asInstanceOf[js.Any])
  }
  
}

