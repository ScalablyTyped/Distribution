package typings.pouchdbCore.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Core {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.pouchdbCore.Blob
    - typings.pouchdbCore.Buffer
  */
  type AttachmentData = typings.pouchdbCore.PouchDB.Core._AttachmentData | java.lang.String
  
  type AttachmentId = java.lang.String
  
  type Attachments = org.scalablytyped.runtime.StringDictionary[typings.pouchdbCore.PouchDB.Core.Attachment]
  
  type Callback[R] = js.Function2[
    /* error */ typings.pouchdbCore.PouchDB.Core.Error | scala.Null, 
    /* result */ R | scala.Null, 
    scala.Unit
  ]
  
  type Document[Content /* <: js.Object */] = Content with typings.pouchdbCore.PouchDB.Core.IdMeta
  
  type DocumentId = java.lang.String
  
  type DocumentKey = java.lang.String
  
  type ExistingDocument[Content /* <: js.Object */] = typings.pouchdbCore.PouchDB.Core.Document[Content] with typings.pouchdbCore.PouchDB.Core.RevisionIdMeta
  
  type NewDocument[Content /* <: js.Object */] = Content
  
  type PostDocument[Content /* <: js.Object */] = typings.pouchdbCore.PouchDB.Core.NewDocument[Content] with typings.pouchdbCore.anon.Attachments
  
  type PutDocument[Content /* <: js.Object */] = typings.pouchdbCore.PouchDB.Core.PostDocument[Content] with typings.pouchdbCore.PouchDB.Core.ChangesMeta with typings.pouchdbCore.anon.Id
  
  /** Existing doc or just object with `_id` and `_rev` */
  type RemoveDocument = typings.pouchdbCore.PouchDB.Core.IdMeta with typings.pouchdbCore.PouchDB.Core.RevisionIdMeta
  
  type RevisionDiffOptions = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type RevisionDiffResponse = org.scalablytyped.runtime.StringDictionary[typings.pouchdbCore.PouchDB.Core.RevisionDiff]
  
  type RevisionId = java.lang.String
}
