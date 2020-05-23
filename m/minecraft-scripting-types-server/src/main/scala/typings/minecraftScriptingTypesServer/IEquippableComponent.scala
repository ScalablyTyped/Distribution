package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Accepteditems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how many and what items the entity can be equipped with.
  */
trait IEquippableComponent extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var slots: js.Array[Accepteditems]
}

object IEquippableComponent {
  @scala.inline
  def apply(slots: js.Array[Accepteditems]): IEquippableComponent = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEquippableComponent]
  }
}

