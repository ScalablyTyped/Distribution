package typings.pem

import typings.pem.mod._HashFunction
import typings.pem.mod._PrivateKeyCipher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pemStrings {
  
  @js.native
  sealed trait aes128
    extends StObject
       with _PrivateKeyCipher
  inline def aes128: aes128 = "aes128".asInstanceOf[aes128]
  
  @js.native
  sealed trait aes192
    extends StObject
       with _PrivateKeyCipher
  inline def aes192: aes192 = "aes192".asInstanceOf[aes192]
  
  @js.native
  sealed trait aes256
    extends StObject
       with _PrivateKeyCipher
  inline def aes256: aes256 = "aes256".asInstanceOf[aes256]
  
  @js.native
  sealed trait camellia128
    extends StObject
       with _PrivateKeyCipher
  inline def camellia128: camellia128 = "camellia128".asInstanceOf[camellia128]
  
  @js.native
  sealed trait camellia192
    extends StObject
       with _PrivateKeyCipher
  inline def camellia192: camellia192 = "camellia192".asInstanceOf[camellia192]
  
  @js.native
  sealed trait camellia256
    extends StObject
       with _PrivateKeyCipher
  inline def camellia256: camellia256 = "camellia256".asInstanceOf[camellia256]
  
  @js.native
  sealed trait des
    extends StObject
       with _PrivateKeyCipher
  inline def des: des = "des".asInstanceOf[des]
  
  @js.native
  sealed trait des3
    extends StObject
       with _PrivateKeyCipher
  inline def des3: des3 = "des3".asInstanceOf[des3]
  
  @js.native
  sealed trait idea
    extends StObject
       with _PrivateKeyCipher
  inline def idea: idea = "idea".asInstanceOf[idea]
  
  @js.native
  sealed trait md5
    extends StObject
       with _HashFunction
  inline def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait sha1
    extends StObject
       with _HashFunction
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256
    extends StObject
       with _HashFunction
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
}
