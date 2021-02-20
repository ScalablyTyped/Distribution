package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object list {
  
  /**
    * Safely splits comma-separated values (such as those for transition-* and
    * background  properties).
    */
  @JSImport("postcss", "list.comma")
  @js.native
  def comma(str: String): js.Array[String] = js.native
  
  /**
    * Safely splits space-separated values (such as those for background,
    * border-radius and other shorthand properties).
    */
  @JSImport("postcss", "list.space")
  @js.native
  def space(str: String): js.Array[String] = js.native
}
