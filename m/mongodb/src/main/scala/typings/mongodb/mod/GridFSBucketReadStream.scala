package typings.mongodb.mod

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "GridFSBucketReadStream")
@js.native
class GridFSBucketReadStream protected () extends Readable {
  def this(
    chunks: Collection[js.Any],
    files: Collection[js.Any],
    readPreference: js.Object,
    filter: js.Object
  ) = this()
  def this(
    chunks: Collection[js.Any],
    files: Collection[js.Any],
    readPreference: js.Object,
    filter: js.Object,
    options: GridFSBucketReadStreamOptions
  ) = this()
  
  var id: typings.bson.mod.ObjectId = js.native
}
