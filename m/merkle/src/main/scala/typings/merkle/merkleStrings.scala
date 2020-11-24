package typings.merkle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object merkleStrings {
  
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @scala.inline
  def whirlpool: whirlpool = "whirlpool".asInstanceOf[whirlpool]
  
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
}
