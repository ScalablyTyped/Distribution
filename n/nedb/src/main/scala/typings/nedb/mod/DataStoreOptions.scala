package typings.nedb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataStoreOptions extends js.Object {
  
  // (optional): hook you can use to transform data after it was serialized and before it is written to disk.
  // Can be used for example to encrypt data before writing database to disk.
  // This function takes a string as parameter (one line of an NeDB data file) and outputs the transformed string, which must absolutely not contain a \n character (or data will be lost)
  var afterSerialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.native
  
   // Optional, specify the name of your NW app if you want options.filename to be relative to the directory where
  var autoload: js.UndefOr[Boolean] = js.native
  
  // (optional): reverse of afterSerialization.
  // Make sure to include both and not just one or you risk data loss.
  // For the same reason, make sure both functions are inverses of one another.
  // Some failsafe mechanisms are in place to prevent data loss if you misuse the serialization hooks:
  // NeDB checks that never one is declared without the other, and checks that they are reverse of one another by testing on random strings of various lengths.
  // In addition, if too much data is detected as corrupt,
  // NeDB will refuse to start as it could mean you're not using the deserialization hook corresponding to the serialization hook used before (see below)
  var beforeDeserialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.native
  
  // (optional): between 0 and 1, defaults to 10%. NeDB will refuse to start if more than this percentage of the datafile is corrupt.
  // 0 means you don't tolerate any corruption, 1 means you don't care
  var corruptAlertThreshold: js.UndefOr[Double] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
   // Optional, datastore will be in-memory only if not provided
  var inMemoryOnly: js.UndefOr[Boolean] = js.native
  
   // Optional, default to false
  var nodeWebkitAppName: js.UndefOr[Boolean] = js.native
  
   // Optional, defaults to false
  // Optional, if autoload is used this will be called after the load database with the error object as parameter. If you don't pass it the error will be thrown
  var onload: js.UndefOr[js.Function1[/* error */ Error | Null, _]] = js.native
  
  // (optional, defaults to false)
  // timestamp the insertion and last update of all documents, with the fields createdAt and updatedAt. User-specified values override automatic generation, usually useful for testing.
  var timestampData: js.UndefOr[Boolean] = js.native
}
object DataStoreOptions {
  
  @scala.inline
  def apply(): DataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataStoreOptions]
  }
  
  @scala.inline
  implicit class DataStoreOptionsOps[Self <: DataStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterSerialization(value: /* line */ String => String): Self = this.set("afterSerialization", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterSerialization: Self = this.set("afterSerialization", js.undefined)
    
    @scala.inline
    def setAutoload(value: Boolean): Self = this.set("autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoload: Self = this.set("autoload", js.undefined)
    
    @scala.inline
    def setBeforeDeserialization(value: /* line */ String => String): Self = this.set("beforeDeserialization", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDeserialization: Self = this.set("beforeDeserialization", js.undefined)
    
    @scala.inline
    def setCorruptAlertThreshold(value: Double): Self = this.set("corruptAlertThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorruptAlertThreshold: Self = this.set("corruptAlertThreshold", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setInMemoryOnly(value: Boolean): Self = this.set("inMemoryOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInMemoryOnly: Self = this.set("inMemoryOnly", js.undefined)
    
    @scala.inline
    def setNodeWebkitAppName(value: Boolean): Self = this.set("nodeWebkitAppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeWebkitAppName: Self = this.set("nodeWebkitAppName", js.undefined)
    
    @scala.inline
    def setOnload(value: /* error */ Error | Null => _): Self = this.set("onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setTimestampData(value: Boolean): Self = this.set("timestampData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampData: Self = this.set("timestampData", js.undefined)
  }
}
