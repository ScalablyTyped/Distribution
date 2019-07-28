package typings.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The querystring.decode() function is an alias for querystring.parse().
    */
  val decode: js.Function4[
    /* str */ java.lang.String, 
    /* sep */ js.UndefOr[java.lang.String], 
    /* eq */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[ParseOptions], 
    ParsedUrlQuery
  ] = js.native
  /**
    * The querystring.encode() function is an alias for querystring.stringify().
    */
  val encode: js.Function4[
    /* obj */ js.UndefOr[ParsedUrlQueryInput], 
    /* sep */ js.UndefOr[java.lang.String], 
    /* eq */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[StringifyOptions], 
    java.lang.String
  ] = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String): ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = js.native
  def stringify(): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

