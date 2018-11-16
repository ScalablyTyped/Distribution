package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Uri extends js.Object {
  /**
               * A list of file names that are associated to the schema. The '*' wildcard can be used. For example '*.schema.json', 'package.json'
               */
  val fileMatch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The schema for the given URI.
               */
  val schema: js.UndefOr[js.Any] = js.undefined
  /**
               * The URI of the schema, which is also the identifier of the schema.
               */
  val uri: java.lang.String
}

