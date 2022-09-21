package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchClient
  extends StObject
     with Nightwatch {
  
  var locateStrategy: LocateStrategy = js.native
  
  var options: NightwatchOptions = js.native
  
  // TODO: Add reporter
  // reporter: reporte
  var sessionID: String = js.native
  
  var settings: NightwatchOptions = js.native
}
