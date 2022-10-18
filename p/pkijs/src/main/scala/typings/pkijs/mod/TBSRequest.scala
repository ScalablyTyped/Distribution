package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TBSRequest structure described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@js.native
trait TBSRequest
  extends StObject
     with PkiObject
     with ITBSRequest {
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MTBSRequest: js.typedarray.ArrayBuffer = js.native
}
