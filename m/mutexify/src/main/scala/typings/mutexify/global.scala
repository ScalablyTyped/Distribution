package typings.mutexify

import typings.mutexify.mod.Lock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def mutexify(): Lock = js.Dynamic.global.applyDynamic("mutexify")().asInstanceOf[Lock]
}
