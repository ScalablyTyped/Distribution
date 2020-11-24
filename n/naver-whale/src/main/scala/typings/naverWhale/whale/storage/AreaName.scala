package typings.naverWhale.whale.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined keyof std.Pick<{  local :chrome.chrome.storage.LocalStorageArea,   sync :chrome.chrome.storage.SyncStorageArea,   managed :chrome.chrome.storage.StorageArea,   onChanged :chrome.chrome.storage.StorageChangedEvent}, 'sync' | 'local' | 'managed'> */
/* Rewritten from type alias, can be one of: 
  - typings.naverWhale.naverWhaleStrings.sync
  - typings.naverWhale.naverWhaleStrings.local
  - typings.naverWhale.naverWhaleStrings.managed
*/
trait AreaName extends js.Object
object AreaName {
  
  @scala.inline
  def local: typings.naverWhale.naverWhaleStrings.local = "local".asInstanceOf[typings.naverWhale.naverWhaleStrings.local]
  
  @scala.inline
  def managed: typings.naverWhale.naverWhaleStrings.managed = "managed".asInstanceOf[typings.naverWhale.naverWhaleStrings.managed]
  
  @scala.inline
  def sync: typings.naverWhale.naverWhaleStrings.sync = "sync".asInstanceOf[typings.naverWhale.naverWhaleStrings.sync]
}
