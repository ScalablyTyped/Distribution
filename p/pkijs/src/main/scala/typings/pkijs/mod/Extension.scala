package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Extension structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@js.native
trait Extension
  extends StObject
     with PkiObject
     with IExtension {
  
  /* private */ var _parsedValue: Any = js.native
  
  @JSName("parsedValue")
  def parsedValue_MExtension: js.UndefOr[ExtensionParsedValue] = js.native
}
