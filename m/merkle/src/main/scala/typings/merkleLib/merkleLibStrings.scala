package typings
package merkleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object merkleLibStrings {
  @js.native
  sealed trait md5 extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait ripemd160 extends js.Object
  
  @js.native
  sealed trait sha1 extends js.Object
  
  @js.native
  sealed trait sha256 extends js.Object
  
  @js.native
  sealed trait sha512 extends js.Object
  
  @js.native
  sealed trait whirlpool extends js.Object
  
  def md5: md5 = "md5".asInstanceOf[md5]
  def none: none = "none".asInstanceOf[none]
  def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  def whirlpool: whirlpool = "whirlpool".asInstanceOf[whirlpool]
}

