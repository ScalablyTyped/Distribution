package typings.nodeJose

import typings.nodeJose.mod.JWK.KeyUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeJoseStrings {
  
  @js.native
  sealed trait DEF extends StObject
  @scala.inline
  def DEF: DEF = "DEF".asInstanceOf[DEF]
  
  @js.native
  sealed trait JWE extends StObject
  @scala.inline
  def JWE: JWE = "JWE".asInstanceOf[JWE]
  
  @js.native
  sealed trait JWS extends StObject
  @scala.inline
  def JWS: JWS = "JWS".asInstanceOf[JWS]
  
  @js.native
  sealed trait compact extends StObject
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait desc
    extends StObject
       with KeyUse
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait enc
    extends StObject
       with KeyUse
  @scala.inline
  def enc: enc = "enc".asInstanceOf[enc]
  
  @js.native
  sealed trait flattened extends StObject
  @scala.inline
  def flattened: flattened = "flattened".asInstanceOf[flattened]
  
  @js.native
  sealed trait general extends StObject
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  
  @js.native
  sealed trait json extends StObject
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait pem extends StObject
  @scala.inline
  def pem: pem = "pem".asInstanceOf[pem]
  
  @js.native
  sealed trait pkcs8 extends StObject
  @scala.inline
  def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  
  @js.native
  sealed trait pkix extends StObject
  @scala.inline
  def pkix: pkix = "pkix".asInstanceOf[pkix]
  
  @js.native
  sealed trait `private` extends StObject
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public extends StObject
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait sig
    extends StObject
       with KeyUse
  @scala.inline
  def sig: sig = "sig".asInstanceOf[sig]
  
  @js.native
  sealed trait spki extends StObject
  @scala.inline
  def spki: spki = "spki".asInstanceOf[spki]
  
  @js.native
  sealed trait x509 extends StObject
  @scala.inline
  def x509: x509 = "x509".asInstanceOf[x509]
}
