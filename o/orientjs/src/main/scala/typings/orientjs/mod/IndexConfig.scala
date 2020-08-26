package typings.orientjs.mod

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

@js.native
trait IndexConfig extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var engine: js.UndefOr[LUCENE | COLA | String] = js.native
  var ifnotexist: js.UndefOr[Boolean] = js.native
  var keyType: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var name: String = js.native
  var properties: js.UndefOr[js.Array[String]] = js.native
  var `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL = js.native
}

object IndexConfig {
  @scala.inline
  def apply(
    name: String,
    `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
  ): IndexConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfig]
  }
  @scala.inline
  implicit class IndexConfigOps[Self <: IndexConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setEngine(value: LUCENE | COLA | String): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setIfnotexist(value: Boolean): Self = this.set("ifnotexist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfnotexist: Self = this.set("ifnotexist", js.undefined)
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

