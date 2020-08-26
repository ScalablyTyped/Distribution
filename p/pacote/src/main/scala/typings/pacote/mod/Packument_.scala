package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.anon.Created
import typings.pacote.anon.Latest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Packument_
  extends CommonMetadata
     with // Non-standard properties may also appear when fullMetadata = true.
/* key */ StringDictionary[js.Any] {
  /**
    * An object mapping dist-tags to version numbers. This is how `foo@latest`
    * gets turned into `foo@1.2.3`.
    */
  var `dist-tags`: Latest with (Record[String, String]) = js.native
  var name: String = js.native
  /**
    * In the full packument, an object mapping version numbers to publication
    * times, for the `opts.before` functionality.
    */
  var time: js.UndefOr[(Record[String, String]) with Created] = js.native
  /**
    * An object where each key is a version, and each value is the manifest for
    * that version.
    */
  var versions: Record[String, Manifest_] = js.native
}

object Packument_ {
  @scala.inline
  def apply(
    `dist-tags`: Latest with (Record[String, String]),
    name: String,
    versions: Record[String, Manifest_]
  ): Packument_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packument_]
  }
  @scala.inline
  implicit class Packument_Ops[Self <: Packument_] (val x: Self) extends AnyVal {
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
    def `setDist-tags`(value: Latest with (Record[String, String])): Self = this.set("dist-tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersions(value: Record[String, Manifest_]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: (Record[String, String]) with Created): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

