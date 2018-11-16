package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "File")
@js.native
class File protected ()
  extends p5Lib.p5Mod.p5Ns.File {
  /**
       *   Base class for a file Using this for
       *   createFileInput
       *
       *   @param file File that is wrapped
       */
  def this(file: File) = this()
  /**
       *   URL string containing image data.
       */
  /* CompleteClass */
  override var data: js.Any = js.native
  /**
       *   Underlying File object. All normal File methods
       *   can be called on this.
       */
  /* CompleteClass */
  override var file: js.Any = js.native
  /**
       *   File name
       */
  /* CompleteClass */
  override var name: js.Any = js.native
  /**
       *   File size
       */
  /* CompleteClass */
  override var size: js.Any = js.native
  /**
       *   File subtype (usually the file extension jpg, png,
       *   xml, etc.)
       */
  /* CompleteClass */
  override var subtype: js.Any = js.native
  /**
       *   File type (image, text, etc.)
       */
  /* CompleteClass */
  override var `type`: js.Any = js.native
}

