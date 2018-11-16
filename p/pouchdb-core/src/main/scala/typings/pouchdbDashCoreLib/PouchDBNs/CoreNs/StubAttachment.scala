package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Stub attachments are returned by PouchDB by default (attachments option set to false)
         */

trait StubAttachment extends js.Object {
  /**
               * Mime type of the attachment
               */
  var content_type: java.lang.String
  /**
               * Database digest of the attachment
               */
  var digest: java.lang.String
  /**
               * Length of the attachment
               */
  var length: scala.Double
  /**
               * Attachment is a stub
               */
  var stub: pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`true`
}

