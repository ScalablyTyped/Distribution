package typings.pouchdbDashCore.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CoreNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.pouchdbDashCore.Anon_Attachments
  import typings.pouchdbDashCore.Anon_Id

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.pouchdbDashCore.Blob
    - typings.pouchdbDashCore.Buffer
  */
  type AttachmentData = _AttachmentData | String
  type AttachmentId = String
  type Attachments = StringDictionary[Attachment]
  type Callback[R] = js.Function2[/* error */ Error | Null, /* result */ R | Null, Unit]
  type Document[Content /* <: js.Object */] = Content with IdMeta
  type DocumentId = String
  type DocumentKey = String
  type ExistingDocument[Content /* <: js.Object */] = Document[Content] with RevisionIdMeta
  type NewDocument[Content /* <: js.Object */] = Content
  type PostDocument[Content /* <: js.Object */] = NewDocument[Content] with Anon_Attachments
  type PutDocument[Content /* <: js.Object */] = PostDocument[Content] with ChangesMeta with Anon_Id
  /** Existing doc or just object with `_id` and `_rev` */
  type RemoveDocument = IdMeta with RevisionIdMeta
  type RevisionDiffOptions = StringDictionary[js.Array[String]]
  type RevisionDiffResponse = StringDictionary[RevisionDiff]
  type RevisionId = String
}
