package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexConfig extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var engine: js.UndefOr[
    orientjsLib.orientjsLibStrings.LUCENE | orientjsLib.orientjsLibStrings.COLA | java.lang.String
  ] = js.undefined
  var keyType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var name: java.lang.String
  var properties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: orientjsLib.orientjsLibStrings.UNIQUE | orientjsLib.orientjsLibStrings.NOTUNIQUE | orientjsLib.orientjsLibStrings.FULLTEXT | orientjsLib.orientjsLibStrings.DICTIONARY | orientjsLib.orientjsLibStrings.UNIQUE_HASH_INDEX | orientjsLib.orientjsLibStrings.NOTUNIQUE_HASH_INDEX | orientjsLib.orientjsLibStrings.FULLTEXT_HASH_INDEX | orientjsLib.orientjsLibStrings.DICTIONARY_HASH_INDEX | orientjsLib.orientjsLibStrings.SPATIAL
}

object IndexConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: orientjsLib.orientjsLibStrings.UNIQUE | orientjsLib.orientjsLibStrings.NOTUNIQUE | orientjsLib.orientjsLibStrings.FULLTEXT | orientjsLib.orientjsLibStrings.DICTIONARY | orientjsLib.orientjsLibStrings.UNIQUE_HASH_INDEX | orientjsLib.orientjsLibStrings.NOTUNIQUE_HASH_INDEX | orientjsLib.orientjsLibStrings.FULLTEXT_HASH_INDEX | orientjsLib.orientjsLibStrings.DICTIONARY_HASH_INDEX | orientjsLib.orientjsLibStrings.SPATIAL,
    `class`: java.lang.String = null,
    engine: orientjsLib.orientjsLibStrings.LUCENE | orientjsLib.orientjsLibStrings.COLA | java.lang.String = null,
    keyType: java.lang.String = null,
    metadata: js.Any = null,
    properties: js.Array[java.lang.String] = null
  ): IndexConfig = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IndexConfig]
  }
}

