package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vendor {
  
  @JSImport("postcss", "vendor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @returns The vendor prefix extracted from the input string.
    */
  @scala.inline
  def prefix(prop: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(prop.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @returns The input string stripped of its vendor prefix.
    */
  @scala.inline
  def unprefixed(prop: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unprefixed")(prop.asInstanceOf[js.Any]).asInstanceOf[String]
}
