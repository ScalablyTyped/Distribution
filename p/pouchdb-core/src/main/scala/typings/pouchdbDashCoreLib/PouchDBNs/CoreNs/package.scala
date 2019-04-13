package typings
package pouchdbDashCoreLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CoreNs {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - pouchdbDashCoreLib.Blob
    - pouchdbDashCoreLib.Buffer
  */
  type AttachmentData = _AttachmentData | java.lang.String
  type AttachmentId = java.lang.String
  type Attachments = org.scalablytyped.runtime.StringDictionary[Attachment]
  type Callback[R] = js.Function2[/* error */ Error | scala.Null, /* result */ R | scala.Null, scala.Unit]
  type Document[Content /* <: js.Object */] = Content with IdMeta
  type DocumentId = java.lang.String
  type DocumentKey = java.lang.String
  type ExistingDocument[Content /* <: js.Object */] = Document[Content] with RevisionIdMeta
  type NewDocument[Content /* <: js.Object */] = Content
  type PostDocument[Content /* <: js.Object */] = NewDocument[Content] with pouchdbDashCoreLib.Anon_Attachments
  type PutDocument[Content /* <: js.Object */] = PostDocument[Content] with ChangesMeta with pouchdbDashCoreLib.Anon_Id
  /** Existing doc or just object with `_id` and `_rev` */
  type RemoveDocument = IdMeta with RevisionIdMeta
  type RevisionDiffOptions = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type RevisionDiffResponse = org.scalablytyped.runtime.StringDictionary[RevisionDiff]
  type RevisionId = java.lang.String
}
