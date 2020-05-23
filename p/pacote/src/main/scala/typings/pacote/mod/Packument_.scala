package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.anon.Created
import typings.pacote.anon.Directory
import typings.pacote.anon.Email
import typings.pacote.anon.Latest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packument_
  extends CommonMetadata
     with // Non-standard properties may also appear when fullMetadata = true.
/* key */ StringDictionary[js.Any] {
  /**
    * An object mapping dist-tags to version numbers. This is how `foo@latest`
    * gets turned into `foo@1.2.3`.
    */
  var `dist-tags`: Latest with (Record[String, String])
  var name: String
  /**
    * In the full packument, an object mapping version numbers to publication
    * times, for the `opts.before` functionality.
    */
  var time: js.UndefOr[(Record[String, String]) with Created] = js.undefined
  /**
    * An object where each key is a version, and each value is the manifest for
    * that version.
    */
  var versions: Record[String, Manifest_]
}

object Packument_ {
  @scala.inline
  def apply(
    `dist-tags`: Latest with (Record[String, String]),
    name: String,
    versions: Record[String, Manifest_],
    StringDictionary: // Non-standard properties may also appear when fullMetadata = true.
  /* key */ StringDictionary[js.Any] = null,
    author: Person = null,
    bugs: Email = null,
    contributors: js.Array[Person] = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    maintainers: js.Array[Person] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: Directory = null,
    time: (Record[String, String]) with Created = null,
    users: Record[String, Boolean] = null
  ): Packument_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packument_]
  }
}

