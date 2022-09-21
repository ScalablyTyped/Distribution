package typings.phaser

import typings.phaser.Phaser.GameObjects.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpineContainer
  extends StObject
     with Container {
  
  def add(child: SpineGameObject): this.type = js.native
  
  def addAt(child: SpineGameObject): this.type = js.native
  def addAt(child: SpineGameObject, index: Double): this.type = js.native
  
  def bringToTop(child: SpineGameObject): this.type = js.native
  
  def exists(child: SpineGameObject): Boolean = js.native
  
  @JSName("first")
  val first_SpineContainer: SpineGameObject = js.native
  
  def getIndex(child: SpineGameObject): Double = js.native
  
  @JSName("last")
  val last_SpineContainer: SpineGameObject = js.native
  
  @JSName("list")
  var list_SpineContainer: js.Array[SpineGameObject] = js.native
  
  def moveDown(child: SpineGameObject): this.type = js.native
  
  def moveTo(child: SpineGameObject, index: Double): this.type = js.native
  
  def moveUp(child: SpineGameObject): this.type = js.native
  
  @JSName("next")
  val next_SpineContainer: SpineGameObject = js.native
  
  @JSName("previous")
  val previous_SpineContainer: SpineGameObject = js.native
  
  def remove(child: SpineGameObject): this.type = js.native
  def remove(child: SpineGameObject, destroyChild: Boolean): this.type = js.native
  
  def replace(oldChild: SpineGameObject, newChild: SpineGameObject): this.type = js.native
  def replace(oldChild: SpineGameObject, newChild: SpineGameObject, destroyChild: Boolean): this.type = js.native
  
  def sendToBack(child: SpineGameObject): this.type = js.native
  
  def swap(child1: SpineGameObject, child2: SpineGameObject): this.type = js.native
}
