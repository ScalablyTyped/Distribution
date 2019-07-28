package typings.orientjs.orientjsMod

import typings.orientjs.orientjsStrings.COLA
import typings.orientjs.orientjsStrings.DICTIONARY
import typings.orientjs.orientjsStrings.DICTIONARY_HASH_INDEX
import typings.orientjs.orientjsStrings.FULLTEXT
import typings.orientjs.orientjsStrings.FULLTEXT_HASH_INDEX
import typings.orientjs.orientjsStrings.LUCENE
import typings.orientjs.orientjsStrings.NOTUNIQUE
import typings.orientjs.orientjsStrings.NOTUNIQUE_HASH_INDEX
import typings.orientjs.orientjsStrings.SPATIAL
import typings.orientjs.orientjsStrings.UNIQUE
import typings.orientjs.orientjsStrings.UNIQUE_HASH_INDEX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexConfig extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var engine: js.UndefOr[LUCENE | COLA | String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var name: String
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
}

object IndexConfig {
  @scala.inline
  def apply(
    name: String,
    `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL,
    `class`: String = null,
    engine: LUCENE | COLA | String = null,
    keyType: String = null,
    metadata: js.Any = null,
    properties: js.Array[String] = null
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

