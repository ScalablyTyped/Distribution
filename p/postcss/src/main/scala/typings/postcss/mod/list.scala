package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object list {
  
  @JSImport("postcss", "list")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Safely splits comma-separated values (such as those for transition-* and
    * background  properties).
    */
  @scala.inline
  def comma(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("comma")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Safely splits space-separated values (such as those for background,
    * border-radius and other shorthand properties).
    */
  @scala.inline
  def space(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("space")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
