package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "SoundFile")
@js.native
class SoundFile protected ()
  extends p5Lib.p5Mod.p5Ns.SoundFile {
  /**
    *   SoundFile object with a path to a file. The
    *   p5.SoundFile may not be available immediately
    *   because it loads the file information
    *   asynchronously.
    *
    *   To do something with the sound as soon as it loads
    *   pass the name of a function as the second
    *   parameter.
    *
    *   Only one file path is required. However, audio
    *   file formats (i.e. mp3, ogg, wav and m4a/aac) are
    *   not supported by all web browsers. If you want to
    *   ensure compatability, instead of a single file
    *   path, you may include an Array of filepaths, and
    *   the browser will choose a format that works.
    *
    *   @param path path to a sound file (String).
    *   Optionally, you may include multiple file formats
    *   in an array. Alternately, accepts an object from
    *   the HTML5 File API, or a p5.File.
    *   @param [successCallback] Name of a function to
    *   call once file loads
    *   @param [errorCallback] Name of a function to call
    *   if file fails to load. This function will receive
    *   an error or XMLHttpRequest object with information
    *   about what went wrong.
    *   @param [whileLoadingCallback] Name of a function
    *   to call while file is loading. That function will
    *   receive progress of the request to load the sound
    *   file (between 0 and 1) as its first parameter.
    *   This progress does not account for the additional
    *   time needed to decode the audio data.
    */
  def this(path: java.lang.String) = this()
  def this(path: js.Array[_]) = this()
  def this(path: java.lang.String, successCallback: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(path: js.Array[_], successCallback: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(path: java.lang.String, successCallback: js.Function1[/* repeated */ js.Any, _], errorCallback: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(path: js.Array[_], successCallback: js.Function1[/* repeated */ js.Any, _], errorCallback: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(path: java.lang.String, successCallback: js.Function1[/* repeated */ js.Any, _], errorCallback: js.Function1[/* repeated */ js.Any, _], whileLoadingCallback: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(path: js.Array[_], successCallback: js.Function1[/* repeated */ js.Any, _], errorCallback: js.Function1[/* repeated */ js.Any, _], whileLoadingCallback: js.Function1[/* repeated */ js.Any, _]) = this()
}

