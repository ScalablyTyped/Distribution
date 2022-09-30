package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("node-sass", "types.List")
@js.native
open class ListCls protected ()
  extends StObject
     with typings.nodeSass.mod.types.List {
  def this(length: Double) = this()
  def this(length: Double, commaSeparator: scala.Boolean) = this()
  
  /* CompleteClass */
  override def getLength(): Double = js.native
  
  /* CompleteClass */
  override def getSeparator(): scala.Boolean = js.native
  
  /* CompleteClass */
  override def getValue(index: Double): Value = js.native
  
  /* CompleteClass */
  override def setSeparator(isComma: scala.Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setValue(index: Double, value: Value): Unit = js.native
}
