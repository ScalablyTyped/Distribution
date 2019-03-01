package typings
package pemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pemLibStrings {
  @js.native
  sealed trait aes128
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait aes192
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait aes256
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait camellia128
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait camellia192
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait camellia256
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait des
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait des3
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait idea
    extends pemLib.pemMod._PrivateKeyCipher
  
  @js.native
  sealed trait md5
    extends pemLib.pemMod._HashFunction
  
  @js.native
  sealed trait sha1
    extends pemLib.pemMod._HashFunction
  
  @js.native
  sealed trait sha256
    extends pemLib.pemMod._HashFunction
  
  @scala.inline
  def aes128: aes128 = "aes128".asInstanceOf[aes128]
  @scala.inline
  def aes192: aes192 = "aes192".asInstanceOf[aes192]
  @scala.inline
  def aes256: aes256 = "aes256".asInstanceOf[aes256]
  @scala.inline
  def camellia128: camellia128 = "camellia128".asInstanceOf[camellia128]
  @scala.inline
  def camellia192: camellia192 = "camellia192".asInstanceOf[camellia192]
  @scala.inline
  def camellia256: camellia256 = "camellia256".asInstanceOf[camellia256]
  @scala.inline
  def des: des = "des".asInstanceOf[des]
  @scala.inline
  def des3: des3 = "des3".asInstanceOf[des3]
  @scala.inline
  def idea: idea = "idea".asInstanceOf[idea]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
}

