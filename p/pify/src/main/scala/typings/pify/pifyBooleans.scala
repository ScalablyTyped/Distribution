package typings.pify

import typings.pify.mod.StringEndsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pifyBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with StringEndsWith[Any, Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with StringEndsWith[Any, Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
