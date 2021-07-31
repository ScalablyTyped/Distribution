package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a CSS declaration.
  */
@js.native
trait Declaration
  extends StObject
     with NodeBase
     with ChildNode {
  
  /**
    * True if the declaration has an !important annotation.
    */
  var important: Boolean = js.native
  
  /**
    * Returns the declaration's parent node.
    */
  var parent: Container = js.native
  
  /**
    * The declaration's property name.
    */
  var prop: String = js.native
  
  var `type`: typings.postcss.postcssStrings.decl = js.native
  
  /**
    * The declaration's value. This value will be cleaned of comments. If the
    * source value contained comments, those comments will be available in the
    * _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: String = js.native
}
