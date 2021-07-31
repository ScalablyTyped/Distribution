package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("meteor/meteor", "Meteor.Error")
@js.native
class ErrorCls protected ()
  extends StObject
     with Error {
  def this(error: String) = this()
  def this(error: Double) = this()
  def this(error: String, reason: String) = this()
  def this(error: Double, reason: String) = this()
  def this(error: String, reason: String, details: String) = this()
  def this(error: String, reason: Unit, details: String) = this()
  def this(error: Double, reason: String, details: String) = this()
  def this(error: Double, reason: Unit, details: String) = this()
  
  /* CompleteClass */
  var error: String | Double = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
