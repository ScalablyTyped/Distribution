package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockRecordPlayerComponent")
@js.native
/* protected */ open class BlockRecordPlayerComponent () extends BlockComponent {
  
  /**
    * @remarks
    * Clears the currently playing record of this record-playing
    * block.
    * @throws This function can throw errors.
    */
  def clearRecord(): Unit = js.native
  
  /**
    * @remarks
    * Returns true if the record-playing block is currently
    * playing a record.
    * @throws This function can throw errors.
    */
  def isPlaying(): Boolean = js.native
  
  val location: BlockLocation = js.native
  
  /**
    * @remarks
    * Sets and plays a record based on an item type.
    * @param recordItemType
    * @throws This function can throw errors.
    */
  def setRecord(recordItemType: ItemType): Unit = js.native
}
/* static members */
object BlockRecordPlayerComponent {
  
  @JSImport("mojang-minecraft", "BlockRecordPlayerComponent.id")
  @js.native
  val id: /* "recordPlayer" */ String = js.native
}
