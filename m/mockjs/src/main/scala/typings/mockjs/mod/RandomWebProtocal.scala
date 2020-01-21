package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Web
// see https://github.com/nuysoft/Mock/wiki/Web
/* Rewritten from type alias, can be one of: 
  - typings.mockjs.mockjsStrings.http
  - typings.mockjs.mockjsStrings.ftp
  - typings.mockjs.mockjsStrings.gopher
  - typings.mockjs.mockjsStrings.mailto
  - typings.mockjs.mockjsStrings.mid
  - typings.mockjs.mockjsStrings.cid
  - typings.mockjs.mockjsStrings.news
  - typings.mockjs.mockjsStrings.nntp
  - typings.mockjs.mockjsStrings.prospero
  - typings.mockjs.mockjsStrings.telnet
  - typings.mockjs.mockjsStrings.rlogin
  - typings.mockjs.mockjsStrings.tn3270
  - typings.mockjs.mockjsStrings.wais
*/
trait RandomWebProtocal extends js.Object

object RandomWebProtocal {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cid: typings.mockjs.mockjsStrings.cid = this.cast("cid")
  @scala.inline
  def ftp: typings.mockjs.mockjsStrings.ftp = this.cast("ftp")
  @scala.inline
  def gopher: typings.mockjs.mockjsStrings.gopher = this.cast("gopher")
  @scala.inline
  def http: typings.mockjs.mockjsStrings.http = this.cast("http")
  @scala.inline
  def mailto: typings.mockjs.mockjsStrings.mailto = this.cast("mailto")
  @scala.inline
  def mid: typings.mockjs.mockjsStrings.mid = this.cast("mid")
  @scala.inline
  def news: typings.mockjs.mockjsStrings.news = this.cast("news")
  @scala.inline
  def nntp: typings.mockjs.mockjsStrings.nntp = this.cast("nntp")
  @scala.inline
  def prospero: typings.mockjs.mockjsStrings.prospero = this.cast("prospero")
  @scala.inline
  def rlogin: typings.mockjs.mockjsStrings.rlogin = this.cast("rlogin")
  @scala.inline
  def telnet: typings.mockjs.mockjsStrings.telnet = this.cast("telnet")
  @scala.inline
  def tn3270: typings.mockjs.mockjsStrings.tn3270 = this.cast("tn3270")
  @scala.inline
  def wais: typings.mockjs.mockjsStrings.wais = this.cast("wais")
}

