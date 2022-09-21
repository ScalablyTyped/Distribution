package typings.nightwatch.mod

import typings.nightwatch.anon.OmitNightwatchAssertionsn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchAssertions
  extends StObject
     with NightwatchCommonAssertions
     with NightwatchCustomAssertions {
  
  /**
    * Negates any of assertions following in the chain.
    */
  var not: OmitNightwatchAssertionsn = js.native
}
