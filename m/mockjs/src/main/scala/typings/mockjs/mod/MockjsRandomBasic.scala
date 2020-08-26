package typings.mockjs.mod

import typings.mockjs.mockjsStrings.lower
import typings.mockjs.mockjsStrings.number
import typings.mockjs.mockjsStrings.symbol
import typings.mockjs.mockjsStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Basic
// see https://github.com/nuysoft/Mock/wiki/Basic
@js.native
trait MockjsRandomBasic extends js.Object {
  def boolean(): B = js.native
  // Random.boolean
  def boolean(min: N, max: N, current: B): B = js.native
  def character(): S = js.native
  def character(pool: S): S = js.native
  // Random.character
  @JSName("character")
  def character_lower(pool: lower): S = js.native
  @JSName("character")
  def character_number(pool: number): S = js.native
  @JSName("character")
  def character_symbol(pool: symbol): S = js.native
  @JSName("character")
  def character_upper(pool: upper): S = js.native
  // Random.float
  def float(): N = js.native
  def float(
    min: js.UndefOr[scala.Nothing],
    max: js.UndefOr[scala.Nothing],
    dmin: js.UndefOr[scala.Nothing],
    dmax: N
  ): N = js.native
  def float(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dmin: N): N = js.native
  def float(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dmin: N, dmax: N): N = js.native
  def float(min: js.UndefOr[scala.Nothing], max: N): N = js.native
  def float(min: js.UndefOr[scala.Nothing], max: N, dmin: js.UndefOr[scala.Nothing], dmax: N): N = js.native
  def float(min: js.UndefOr[scala.Nothing], max: N, dmin: N): N = js.native
  def float(min: js.UndefOr[scala.Nothing], max: N, dmin: N, dmax: N): N = js.native
  def float(min: N): N = js.native
  def float(min: N, max: js.UndefOr[scala.Nothing], dmin: js.UndefOr[scala.Nothing], dmax: N): N = js.native
  def float(min: N, max: js.UndefOr[scala.Nothing], dmin: N): N = js.native
  def float(min: N, max: js.UndefOr[scala.Nothing], dmin: N, dmax: N): N = js.native
  def float(min: N, max: N): N = js.native
  def float(min: N, max: N, dmin: js.UndefOr[scala.Nothing], dmax: N): N = js.native
  def float(min: N, max: N, dmin: N): N = js.native
  def float(min: N, max: N, dmin: N, dmax: N): N = js.native
  // Random.integer
  def integer(): N = js.native
  def integer(min: js.UndefOr[scala.Nothing], max: N): N = js.native
  def integer(min: N): N = js.native
  def integer(min: N, max: N): N = js.native
  // Random.natural
  def natural(): N = js.native
  def natural(min: js.UndefOr[scala.Nothing], max: N): N = js.native
  def natural(min: N): N = js.native
  def natural(min: N, max: N): N = js.native
  // Random.range
  def range(): N = js.native
  def range(start: js.UndefOr[scala.Nothing], stop: js.UndefOr[scala.Nothing], step: N): N = js.native
  def range(start: js.UndefOr[scala.Nothing], stop: N): N = js.native
  def range(start: js.UndefOr[scala.Nothing], stop: N, step: N): N = js.native
  def range(start: N): N = js.native
  def range(start: N, stop: js.UndefOr[scala.Nothing], step: N): N = js.native
  def range(start: N, stop: N): N = js.native
  def range(start: N, stop: N, step: N): N = js.native
  // Random.string
  def string(): S = js.native
  def string(pool: js.UndefOr[scala.Nothing], min: js.UndefOr[scala.Nothing], max: N): S = js.native
  def string(pool: js.UndefOr[scala.Nothing], min: N): S = js.native
  def string(pool: js.UndefOr[scala.Nothing], min: N, max: N): S = js.native
  def string(pool: N): S = js.native
  def string(pool: N, min: js.UndefOr[scala.Nothing], max: N): S = js.native
  def string(pool: N, min: N): S = js.native
  def string(pool: N, min: N, max: N): S = js.native
  def string(pool: S): S = js.native
  def string(pool: S, min: js.UndefOr[scala.Nothing], max: N): S = js.native
  def string(pool: S, min: N): S = js.native
  def string(pool: S, min: N, max: N): S = js.native
}

