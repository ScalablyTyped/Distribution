package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basically a very large random number (128-bit) which means the probability of creating two that clash is vanishingly small.
  * GUIDs are used as the unique identifiers for Entities.
  */
object guid {
  
  @JSGlobal("pc.guid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an RFC4122 version 4 compliant GUID.
    * @returns A new GUID.
    */
  inline def create(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[String]
}
