package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A Group is a collection of items. When you transform a Group, its
  * children are treated as a single unit without changing their relative
  * positions.
  */
@js.native
trait Group
  extends StObject
     with Item {
  
  /** 
    * Specifies whether the group item is to be clipped. When setting to
    * `true`, the first child in the group is automatically defined as the
    * clipping mask.
    */
  var clipped: Boolean = js.native
}
