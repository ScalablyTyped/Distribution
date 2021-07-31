package typings.monk

import typings.monk.mod.DropResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monkBooleans {
  
  @js.native
  sealed trait `false` extends StObject
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with DropResult
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}
