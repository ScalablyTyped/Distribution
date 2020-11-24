package typings.pouchdbAdapterLeveldb.PouchDB.LevelDbAdapter

import typings.pouchdbAdapterLeveldb.pouchdbAdapterLeveldbStrings.leveldb
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDbAdapterConfiguration extends LocalDatabaseConfiguration {
  
  @JSName("adapter")
  var adapter_LevelDbAdapterConfiguration: leveldb = js.native
}
object LevelDbAdapterConfiguration {
  
  @scala.inline
  def apply(adapter: leveldb): LevelDbAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDbAdapterConfiguration]
  }
  
  @scala.inline
  implicit class LevelDbAdapterConfigurationOps[Self <: LevelDbAdapterConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapter(value: leveldb): Self = this.set("adapter", value.asInstanceOf[js.Any])
  }
}
