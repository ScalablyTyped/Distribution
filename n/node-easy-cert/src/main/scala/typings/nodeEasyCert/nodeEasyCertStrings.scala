package typings.nodeEasyCert

import typings.nodeEasyCert.mod.CertErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEasyCertStrings {
  
  @js.native
  sealed trait ROOT_CA_COMMON_NAME_UNSPECIFIED
    extends StObject
       with CertErrors
  @scala.inline
  def ROOT_CA_COMMON_NAME_UNSPECIFIED: ROOT_CA_COMMON_NAME_UNSPECIFIED = "ROOT_CA_COMMON_NAME_UNSPECIFIED".asInstanceOf[ROOT_CA_COMMON_NAME_UNSPECIFIED]
  
  @js.native
  sealed trait ROOT_CA_EXISTED
    extends StObject
       with CertErrors
  @scala.inline
  def ROOT_CA_EXISTED: ROOT_CA_EXISTED = "ROOT_CA_EXISTED".asInstanceOf[ROOT_CA_EXISTED]
  
  @js.native
  sealed trait ROOT_CA_NOT_EXISTS
    extends StObject
       with CertErrors
  @scala.inline
  def ROOT_CA_NOT_EXISTS: ROOT_CA_NOT_EXISTS = "ROOT_CA_NOT_EXISTS".asInstanceOf[ROOT_CA_NOT_EXISTS]
}
