package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMovieDB extends js.Object {
  def movieImages(
    options: InfoOptions,
    callback: js.Function2[/* err */ js.Any, /* images */ MovieImages, scala.Unit]
  ): scala.Unit
  def movieInfo(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* curMovie */ Movie, scala.Unit]): scala.Unit
  def searchMovie(
    params: SearchOptions,
    callback: js.Function2[/* err */ js.Any, /* movies */ SearchResults, scala.Unit]
  ): scala.Unit
}

