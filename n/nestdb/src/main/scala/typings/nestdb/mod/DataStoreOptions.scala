package typings.nestdb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStoreOptions extends js.Object {
  // (optional): hook you can use to transform data after it was serialized and before it is written to disk.
  // Can be used for example to encrypt data before writing database to disk.
  // This function takes a string as parameter (one line of an NestDb data file) and outputs the transformed string, which must absolutely not contain a \n character (or data will be lost)
  var afterSerialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.undefined
   // Optional, specify the name of your NW app if you want options.filename to be relative to the directory where
  var autoload: js.UndefOr[Boolean] = js.undefined
  // (optional): reverse of afterSerialization.
  // Make sure to include both and not just one or you risk data loss.
  // For the same reason, make sure both functions are inverses of one another.
  // Some failsafe mechanisms are in place to prevent data loss if you misuse the serialization hooks:
  // NestDb checks that never one is declared without the other, and checks that they are reverse of one another by testing on random strings of various lengths.
  // In addition, if too much data is detected as corrupt,
  // NestDb will refuse to start as it could mean you're not using the deserialization hook corresponding to the serialization hook used before (see below)
  var beforeDeserialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.undefined
  // (optional): between 0 and 1, defaults to 10%. NestDb will refuse to start if more than this percentage of the datafile is corrupt.
  // 0 means you don't tolerate any corruption, 1 means you don't care
  var corruptAlertThreshold: js.UndefOr[Double] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
   // Optional, datastore will be in-memory only if not provided
  var inMemoryOnly: js.UndefOr[Boolean] = js.undefined
   // Optional, default to false
  var nodeWebkitAppName: js.UndefOr[Boolean] = js.undefined
   // Optional, defaults to false
  // Optional, if autoload is used this will be called after the load database with the error object as parameter. If you don't pass it the error will be thrown
  var onload: js.UndefOr[js.Function1[/* error */ Error, _]] = js.undefined
  // (optional, defaults to false)
  // timestamp the insertion and last update of all documents, with the fields createdAt and updatedAt. User-specified values override automatic generation, usually useful for testing.
  var timestampData: js.UndefOr[Boolean] = js.undefined
}

object DataStoreOptions {
  @scala.inline
  def apply(
    afterSerialization: /* line */ String => String = null,
    autoload: js.UndefOr[Boolean] = js.undefined,
    beforeDeserialization: /* line */ String => String = null,
    corruptAlertThreshold: js.UndefOr[Double] = js.undefined,
    filename: String = null,
    inMemoryOnly: js.UndefOr[Boolean] = js.undefined,
    nodeWebkitAppName: js.UndefOr[Boolean] = js.undefined,
    onload: /* error */ Error => _ = null,
    timestampData: js.UndefOr[Boolean] = js.undefined
  ): DataStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (afterSerialization != null) __obj.updateDynamic("afterSerialization")(js.Any.fromFunction1(afterSerialization))
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload.get.asInstanceOf[js.Any])
    if (beforeDeserialization != null) __obj.updateDynamic("beforeDeserialization")(js.Any.fromFunction1(beforeDeserialization))
    if (!js.isUndefined(corruptAlertThreshold)) __obj.updateDynamic("corruptAlertThreshold")(corruptAlertThreshold.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(inMemoryOnly)) __obj.updateDynamic("inMemoryOnly")(inMemoryOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeWebkitAppName)) __obj.updateDynamic("nodeWebkitAppName")(nodeWebkitAppName.get.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (!js.isUndefined(timestampData)) __obj.updateDynamic("timestampData")(timestampData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStoreOptions]
  }
}

