package typings.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Text option opentype features as listed at https://docs.microsoft.com/en-us/typography/opentype/spec/featurelist
/* Rewritten from type alias, can be one of: 
  - typings.pdfkit.pdfkitStrings.aalt
  - typings.pdfkit.pdfkitStrings.abvf
  - typings.pdfkit.pdfkitStrings.abvm
  - typings.pdfkit.pdfkitStrings.abvs
  - typings.pdfkit.pdfkitStrings.afrc
  - typings.pdfkit.pdfkitStrings.akhn
  - typings.pdfkit.pdfkitStrings.blwf
  - typings.pdfkit.pdfkitStrings.blwm
  - typings.pdfkit.pdfkitStrings.blws
  - typings.pdfkit.pdfkitStrings.calt
  - typings.pdfkit.pdfkitStrings.`case`
  - typings.pdfkit.pdfkitStrings.cfar
  - typings.pdfkit.pdfkitStrings.cjct
  - typings.pdfkit.pdfkitStrings.clig
  - typings.pdfkit.pdfkitStrings.cpct
  - typings.pdfkit.pdfkitStrings.cpsp
  - typings.pdfkit.pdfkitStrings.cswh
  - typings.pdfkit.pdfkitStrings.curs
  - typings.pdfkit.pdfkitStrings.cv01
  - typings.pdfkit.pdfkitStrings.cv02
  - typings.pdfkit.pdfkitStrings.cv03
  - typings.pdfkit.pdfkitStrings.cv04
  - typings.pdfkit.pdfkitStrings.cv05
  - typings.pdfkit.pdfkitStrings.cv06
  - typings.pdfkit.pdfkitStrings.cv07
  - typings.pdfkit.pdfkitStrings.cv08
  - typings.pdfkit.pdfkitStrings.cv09
  - typings.pdfkit.pdfkitStrings.cv10
  - typings.pdfkit.pdfkitStrings.cv11
  - typings.pdfkit.pdfkitStrings.cv12
  - typings.pdfkit.pdfkitStrings.cv13
  - typings.pdfkit.pdfkitStrings.cv14
  - typings.pdfkit.pdfkitStrings.cv15
  - typings.pdfkit.pdfkitStrings.cv16
  - typings.pdfkit.pdfkitStrings.cv17
  - typings.pdfkit.pdfkitStrings.cv18
  - typings.pdfkit.pdfkitStrings.cv19
  - typings.pdfkit.pdfkitStrings.cv20
  - typings.pdfkit.pdfkitStrings.cv21
  - typings.pdfkit.pdfkitStrings.cv22
  - typings.pdfkit.pdfkitStrings.cv23
  - typings.pdfkit.pdfkitStrings.cv24
  - typings.pdfkit.pdfkitStrings.cv25
  - typings.pdfkit.pdfkitStrings.cv26
  - typings.pdfkit.pdfkitStrings.cv27
  - typings.pdfkit.pdfkitStrings.cv28
  - typings.pdfkit.pdfkitStrings.cv29
  - typings.pdfkit.pdfkitStrings.cv30
  - typings.pdfkit.pdfkitStrings.cv31
  - typings.pdfkit.pdfkitStrings.cv32
  - typings.pdfkit.pdfkitStrings.cv33
  - typings.pdfkit.pdfkitStrings.cv34
  - typings.pdfkit.pdfkitStrings.cv35
  - typings.pdfkit.pdfkitStrings.cv36
  - typings.pdfkit.pdfkitStrings.cv37
  - typings.pdfkit.pdfkitStrings.cv38
  - typings.pdfkit.pdfkitStrings.cv39
  - typings.pdfkit.pdfkitStrings.cv40
  - typings.pdfkit.pdfkitStrings.cv41
  - typings.pdfkit.pdfkitStrings.cv42
  - typings.pdfkit.pdfkitStrings.cv43
  - typings.pdfkit.pdfkitStrings.cv44
  - typings.pdfkit.pdfkitStrings.cv45
  - typings.pdfkit.pdfkitStrings.cv46
  - typings.pdfkit.pdfkitStrings.cv47
  - typings.pdfkit.pdfkitStrings.cv48
  - typings.pdfkit.pdfkitStrings.cv49
  - typings.pdfkit.pdfkitStrings.cv50
  - typings.pdfkit.pdfkitStrings.cv51
  - typings.pdfkit.pdfkitStrings.cv52
  - typings.pdfkit.pdfkitStrings.cv53
  - typings.pdfkit.pdfkitStrings.cv54
  - typings.pdfkit.pdfkitStrings.cv55
  - typings.pdfkit.pdfkitStrings.cv56
  - typings.pdfkit.pdfkitStrings.cv57
  - typings.pdfkit.pdfkitStrings.cv58
  - typings.pdfkit.pdfkitStrings.cv59
  - typings.pdfkit.pdfkitStrings.cv60
  - typings.pdfkit.pdfkitStrings.cv61
  - typings.pdfkit.pdfkitStrings.cv62
  - typings.pdfkit.pdfkitStrings.cv63
  - typings.pdfkit.pdfkitStrings.cv64
  - typings.pdfkit.pdfkitStrings.cv65
  - typings.pdfkit.pdfkitStrings.cv66
  - typings.pdfkit.pdfkitStrings.cv67
  - typings.pdfkit.pdfkitStrings.cv68
  - typings.pdfkit.pdfkitStrings.cv69
  - typings.pdfkit.pdfkitStrings.cv70
  - typings.pdfkit.pdfkitStrings.cv71
  - typings.pdfkit.pdfkitStrings.cv72
  - typings.pdfkit.pdfkitStrings.cv73
  - typings.pdfkit.pdfkitStrings.cv74
  - typings.pdfkit.pdfkitStrings.cv75
  - typings.pdfkit.pdfkitStrings.cv76
  - typings.pdfkit.pdfkitStrings.cv77
  - typings.pdfkit.pdfkitStrings.cv78
  - typings.pdfkit.pdfkitStrings.cv79
  - typings.pdfkit.pdfkitStrings.cv80
  - typings.pdfkit.pdfkitStrings.cv81
  - typings.pdfkit.pdfkitStrings.cv82
  - typings.pdfkit.pdfkitStrings.cv83
  - typings.pdfkit.pdfkitStrings.cv84
  - typings.pdfkit.pdfkitStrings.cv85
  - typings.pdfkit.pdfkitStrings.cv86
  - typings.pdfkit.pdfkitStrings.cv87
  - typings.pdfkit.pdfkitStrings.cv88
  - typings.pdfkit.pdfkitStrings.cv89
  - typings.pdfkit.pdfkitStrings.cv90
  - typings.pdfkit.pdfkitStrings.cv91
  - typings.pdfkit.pdfkitStrings.cv92
  - typings.pdfkit.pdfkitStrings.cv93
  - typings.pdfkit.pdfkitStrings.cv94
  - typings.pdfkit.pdfkitStrings.cv95
  - typings.pdfkit.pdfkitStrings.cv96
  - typings.pdfkit.pdfkitStrings.cv97
  - typings.pdfkit.pdfkitStrings.cv98
  - typings.pdfkit.pdfkitStrings.cv99
  - typings.pdfkit.pdfkitStrings.c2pc
  - typings.pdfkit.pdfkitStrings.c2sc
  - typings.pdfkit.pdfkitStrings.dist
  - typings.pdfkit.pdfkitStrings.ccmp
  - typings.pdfkit.pdfkitStrings.dlig
  - typings.pdfkit.pdfkitStrings.dnom
  - typings.pdfkit.pdfkitStrings.dtls
  - typings.pdfkit.pdfkitStrings.expt
  - typings.pdfkit.pdfkitStrings.falt
  - typings.pdfkit.pdfkitStrings.fin2
  - typings.pdfkit.pdfkitStrings.fin3
  - typings.pdfkit.pdfkitStrings.fina
  - typings.pdfkit.pdfkitStrings.flac
  - typings.pdfkit.pdfkitStrings.frac
  - typings.pdfkit.pdfkitStrings.fwid
  - typings.pdfkit.pdfkitStrings.half
  - typings.pdfkit.pdfkitStrings.haln
  - typings.pdfkit.pdfkitStrings.halt
  - typings.pdfkit.pdfkitStrings.hist
  - typings.pdfkit.pdfkitStrings.hkna
  - typings.pdfkit.pdfkitStrings.hlig
  - typings.pdfkit.pdfkitStrings.hngl
  - typings.pdfkit.pdfkitStrings.hojo
  - typings.pdfkit.pdfkitStrings.hwid
  - typings.pdfkit.pdfkitStrings.init
  - typings.pdfkit.pdfkitStrings.isol
  - typings.pdfkit.pdfkitStrings.ital
  - typings.pdfkit.pdfkitStrings.jalt
  - typings.pdfkit.pdfkitStrings.jp78
  - typings.pdfkit.pdfkitStrings.jp83
  - typings.pdfkit.pdfkitStrings.jp90
  - typings.pdfkit.pdfkitStrings.jp04
  - typings.pdfkit.pdfkitStrings.kern
  - typings.pdfkit.pdfkitStrings.lfbd
  - typings.pdfkit.pdfkitStrings.liga
  - typings.pdfkit.pdfkitStrings.ljmo
  - typings.pdfkit.pdfkitStrings.lnum
  - typings.pdfkit.pdfkitStrings.locl
  - typings.pdfkit.pdfkitStrings.ltra
  - typings.pdfkit.pdfkitStrings.ltrm
  - typings.pdfkit.pdfkitStrings.mark
  - typings.pdfkit.pdfkitStrings.med2
  - typings.pdfkit.pdfkitStrings.medi
  - typings.pdfkit.pdfkitStrings.mgrk
  - typings.pdfkit.pdfkitStrings.mkmk
  - typings.pdfkit.pdfkitStrings.mset
  - typings.pdfkit.pdfkitStrings.nalt
  - typings.pdfkit.pdfkitStrings.nlck
  - typings.pdfkit.pdfkitStrings.nukt
  - typings.pdfkit.pdfkitStrings.numr
  - typings.pdfkit.pdfkitStrings.onum
  - typings.pdfkit.pdfkitStrings.opbd
  - typings.pdfkit.pdfkitStrings.ordn
  - typings.pdfkit.pdfkitStrings.ornm
  - typings.pdfkit.pdfkitStrings.palt
  - typings.pdfkit.pdfkitStrings.pcap
  - typings.pdfkit.pdfkitStrings.pkna
  - typings.pdfkit.pdfkitStrings.pnum
  - typings.pdfkit.pdfkitStrings.pref
  - typings.pdfkit.pdfkitStrings.pres
  - typings.pdfkit.pdfkitStrings.pstf
  - typings.pdfkit.pdfkitStrings.psts
  - typings.pdfkit.pdfkitStrings.pwid
  - typings.pdfkit.pdfkitStrings.qwid
  - typings.pdfkit.pdfkitStrings.rand
  - typings.pdfkit.pdfkitStrings.rclt
  - typings.pdfkit.pdfkitStrings.rkrf
  - typings.pdfkit.pdfkitStrings.rlig
  - typings.pdfkit.pdfkitStrings.rphf
  - typings.pdfkit.pdfkitStrings.rtbd
  - typings.pdfkit.pdfkitStrings.rtla
  - typings.pdfkit.pdfkitStrings.rtlm
  - typings.pdfkit.pdfkitStrings.ruby
  - typings.pdfkit.pdfkitStrings.rvrn
  - typings.pdfkit.pdfkitStrings.salt
  - typings.pdfkit.pdfkitStrings.sinf
  - typings.pdfkit.pdfkitStrings.size
  - typings.pdfkit.pdfkitStrings.smcp
  - typings.pdfkit.pdfkitStrings.smpl
  - typings.pdfkit.pdfkitStrings.ss01
  - typings.pdfkit.pdfkitStrings.ss02
  - typings.pdfkit.pdfkitStrings.ss03
  - typings.pdfkit.pdfkitStrings.ss04
  - typings.pdfkit.pdfkitStrings.ss05
  - typings.pdfkit.pdfkitStrings.ss06
  - typings.pdfkit.pdfkitStrings.ss07
  - typings.pdfkit.pdfkitStrings.ss08
  - typings.pdfkit.pdfkitStrings.ss09
  - typings.pdfkit.pdfkitStrings.ss10
  - typings.pdfkit.pdfkitStrings.ss11
  - typings.pdfkit.pdfkitStrings.ss12
  - typings.pdfkit.pdfkitStrings.ss13
  - typings.pdfkit.pdfkitStrings.ss14
  - typings.pdfkit.pdfkitStrings.ss15
  - typings.pdfkit.pdfkitStrings.ss16
  - typings.pdfkit.pdfkitStrings.ss17
  - typings.pdfkit.pdfkitStrings.ss18
  - typings.pdfkit.pdfkitStrings.ss19
  - typings.pdfkit.pdfkitStrings.ss20
  - typings.pdfkit.pdfkitStrings.ssty
  - typings.pdfkit.pdfkitStrings.stch
  - typings.pdfkit.pdfkitStrings.subs
  - typings.pdfkit.pdfkitStrings.sups
  - typings.pdfkit.pdfkitStrings.swsh
  - typings.pdfkit.pdfkitStrings.titl
  - typings.pdfkit.pdfkitStrings.tjmo
  - typings.pdfkit.pdfkitStrings.tnam
  - typings.pdfkit.pdfkitStrings.tnum
  - typings.pdfkit.pdfkitStrings.trad
  - typings.pdfkit.pdfkitStrings.twid
  - typings.pdfkit.pdfkitStrings.unic
  - typings.pdfkit.pdfkitStrings.valt
  - typings.pdfkit.pdfkitStrings.vatu
  - typings.pdfkit.pdfkitStrings.vert
  - typings.pdfkit.pdfkitStrings.vhal
  - typings.pdfkit.pdfkitStrings.vjmo
  - typings.pdfkit.pdfkitStrings.vkna
  - typings.pdfkit.pdfkitStrings.vkrn
  - typings.pdfkit.pdfkitStrings.vpal
  - typings.pdfkit.pdfkitStrings.vrt2
  - typings.pdfkit.pdfkitStrings.vrtr
  - typings.pdfkit.pdfkitStrings.zero
*/
trait OpenTypeFeatures extends js.Object

object OpenTypeFeatures {
  @scala.inline
  def aalt: typings.pdfkit.pdfkitStrings.aalt = "aalt".asInstanceOf[typings.pdfkit.pdfkitStrings.aalt]
  @scala.inline
  def abvf: typings.pdfkit.pdfkitStrings.abvf = "abvf".asInstanceOf[typings.pdfkit.pdfkitStrings.abvf]
  @scala.inline
  def abvm: typings.pdfkit.pdfkitStrings.abvm = "abvm".asInstanceOf[typings.pdfkit.pdfkitStrings.abvm]
  @scala.inline
  def abvs: typings.pdfkit.pdfkitStrings.abvs = "abvs".asInstanceOf[typings.pdfkit.pdfkitStrings.abvs]
  @scala.inline
  def afrc: typings.pdfkit.pdfkitStrings.afrc = "afrc".asInstanceOf[typings.pdfkit.pdfkitStrings.afrc]
  @scala.inline
  def akhn: typings.pdfkit.pdfkitStrings.akhn = "akhn".asInstanceOf[typings.pdfkit.pdfkitStrings.akhn]
  @scala.inline
  def blwf: typings.pdfkit.pdfkitStrings.blwf = "blwf".asInstanceOf[typings.pdfkit.pdfkitStrings.blwf]
  @scala.inline
  def blwm: typings.pdfkit.pdfkitStrings.blwm = "blwm".asInstanceOf[typings.pdfkit.pdfkitStrings.blwm]
  @scala.inline
  def blws: typings.pdfkit.pdfkitStrings.blws = "blws".asInstanceOf[typings.pdfkit.pdfkitStrings.blws]
  @scala.inline
  def c2pc: typings.pdfkit.pdfkitStrings.c2pc = "c2pc".asInstanceOf[typings.pdfkit.pdfkitStrings.c2pc]
  @scala.inline
  def c2sc: typings.pdfkit.pdfkitStrings.c2sc = "c2sc".asInstanceOf[typings.pdfkit.pdfkitStrings.c2sc]
  @scala.inline
  def calt: typings.pdfkit.pdfkitStrings.calt = "calt".asInstanceOf[typings.pdfkit.pdfkitStrings.calt]
  @scala.inline
  def `case`: typings.pdfkit.pdfkitStrings.`case` = "case".asInstanceOf[typings.pdfkit.pdfkitStrings.`case`]
  @scala.inline
  def ccmp: typings.pdfkit.pdfkitStrings.ccmp = "ccmp".asInstanceOf[typings.pdfkit.pdfkitStrings.ccmp]
  @scala.inline
  def cfar: typings.pdfkit.pdfkitStrings.cfar = "cfar".asInstanceOf[typings.pdfkit.pdfkitStrings.cfar]
  @scala.inline
  def cjct: typings.pdfkit.pdfkitStrings.cjct = "cjct".asInstanceOf[typings.pdfkit.pdfkitStrings.cjct]
  @scala.inline
  def clig: typings.pdfkit.pdfkitStrings.clig = "clig".asInstanceOf[typings.pdfkit.pdfkitStrings.clig]
  @scala.inline
  def cpct: typings.pdfkit.pdfkitStrings.cpct = "cpct".asInstanceOf[typings.pdfkit.pdfkitStrings.cpct]
  @scala.inline
  def cpsp: typings.pdfkit.pdfkitStrings.cpsp = "cpsp".asInstanceOf[typings.pdfkit.pdfkitStrings.cpsp]
  @scala.inline
  def cswh: typings.pdfkit.pdfkitStrings.cswh = "cswh".asInstanceOf[typings.pdfkit.pdfkitStrings.cswh]
  @scala.inline
  def curs: typings.pdfkit.pdfkitStrings.curs = "curs".asInstanceOf[typings.pdfkit.pdfkitStrings.curs]
  @scala.inline
  def cv01: typings.pdfkit.pdfkitStrings.cv01 = "cv01".asInstanceOf[typings.pdfkit.pdfkitStrings.cv01]
  @scala.inline
  def cv02: typings.pdfkit.pdfkitStrings.cv02 = "cv02".asInstanceOf[typings.pdfkit.pdfkitStrings.cv02]
  @scala.inline
  def cv03: typings.pdfkit.pdfkitStrings.cv03 = "cv03".asInstanceOf[typings.pdfkit.pdfkitStrings.cv03]
  @scala.inline
  def cv04: typings.pdfkit.pdfkitStrings.cv04 = "cv04".asInstanceOf[typings.pdfkit.pdfkitStrings.cv04]
  @scala.inline
  def cv05: typings.pdfkit.pdfkitStrings.cv05 = "cv05".asInstanceOf[typings.pdfkit.pdfkitStrings.cv05]
  @scala.inline
  def cv06: typings.pdfkit.pdfkitStrings.cv06 = "cv06".asInstanceOf[typings.pdfkit.pdfkitStrings.cv06]
  @scala.inline
  def cv07: typings.pdfkit.pdfkitStrings.cv07 = "cv07".asInstanceOf[typings.pdfkit.pdfkitStrings.cv07]
  @scala.inline
  def cv08: typings.pdfkit.pdfkitStrings.cv08 = "cv08".asInstanceOf[typings.pdfkit.pdfkitStrings.cv08]
  @scala.inline
  def cv09: typings.pdfkit.pdfkitStrings.cv09 = "cv09".asInstanceOf[typings.pdfkit.pdfkitStrings.cv09]
  @scala.inline
  def cv10: typings.pdfkit.pdfkitStrings.cv10 = "cv10".asInstanceOf[typings.pdfkit.pdfkitStrings.cv10]
  @scala.inline
  def cv11: typings.pdfkit.pdfkitStrings.cv11 = "cv11".asInstanceOf[typings.pdfkit.pdfkitStrings.cv11]
  @scala.inline
  def cv12: typings.pdfkit.pdfkitStrings.cv12 = "cv12".asInstanceOf[typings.pdfkit.pdfkitStrings.cv12]
  @scala.inline
  def cv13: typings.pdfkit.pdfkitStrings.cv13 = "cv13".asInstanceOf[typings.pdfkit.pdfkitStrings.cv13]
  @scala.inline
  def cv14: typings.pdfkit.pdfkitStrings.cv14 = "cv14".asInstanceOf[typings.pdfkit.pdfkitStrings.cv14]
  @scala.inline
  def cv15: typings.pdfkit.pdfkitStrings.cv15 = "cv15".asInstanceOf[typings.pdfkit.pdfkitStrings.cv15]
  @scala.inline
  def cv16: typings.pdfkit.pdfkitStrings.cv16 = "cv16".asInstanceOf[typings.pdfkit.pdfkitStrings.cv16]
  @scala.inline
  def cv17: typings.pdfkit.pdfkitStrings.cv17 = "cv17".asInstanceOf[typings.pdfkit.pdfkitStrings.cv17]
  @scala.inline
  def cv18: typings.pdfkit.pdfkitStrings.cv18 = "cv18".asInstanceOf[typings.pdfkit.pdfkitStrings.cv18]
  @scala.inline
  def cv19: typings.pdfkit.pdfkitStrings.cv19 = "cv19".asInstanceOf[typings.pdfkit.pdfkitStrings.cv19]
  @scala.inline
  def cv20: typings.pdfkit.pdfkitStrings.cv20 = "cv20".asInstanceOf[typings.pdfkit.pdfkitStrings.cv20]
  @scala.inline
  def cv21: typings.pdfkit.pdfkitStrings.cv21 = "cv21".asInstanceOf[typings.pdfkit.pdfkitStrings.cv21]
  @scala.inline
  def cv22: typings.pdfkit.pdfkitStrings.cv22 = "cv22".asInstanceOf[typings.pdfkit.pdfkitStrings.cv22]
  @scala.inline
  def cv23: typings.pdfkit.pdfkitStrings.cv23 = "cv23".asInstanceOf[typings.pdfkit.pdfkitStrings.cv23]
  @scala.inline
  def cv24: typings.pdfkit.pdfkitStrings.cv24 = "cv24".asInstanceOf[typings.pdfkit.pdfkitStrings.cv24]
  @scala.inline
  def cv25: typings.pdfkit.pdfkitStrings.cv25 = "cv25".asInstanceOf[typings.pdfkit.pdfkitStrings.cv25]
  @scala.inline
  def cv26: typings.pdfkit.pdfkitStrings.cv26 = "cv26".asInstanceOf[typings.pdfkit.pdfkitStrings.cv26]
  @scala.inline
  def cv27: typings.pdfkit.pdfkitStrings.cv27 = "cv27".asInstanceOf[typings.pdfkit.pdfkitStrings.cv27]
  @scala.inline
  def cv28: typings.pdfkit.pdfkitStrings.cv28 = "cv28".asInstanceOf[typings.pdfkit.pdfkitStrings.cv28]
  @scala.inline
  def cv29: typings.pdfkit.pdfkitStrings.cv29 = "cv29".asInstanceOf[typings.pdfkit.pdfkitStrings.cv29]
  @scala.inline
  def cv30: typings.pdfkit.pdfkitStrings.cv30 = "cv30".asInstanceOf[typings.pdfkit.pdfkitStrings.cv30]
  @scala.inline
  def cv31: typings.pdfkit.pdfkitStrings.cv31 = "cv31".asInstanceOf[typings.pdfkit.pdfkitStrings.cv31]
  @scala.inline
  def cv32: typings.pdfkit.pdfkitStrings.cv32 = "cv32".asInstanceOf[typings.pdfkit.pdfkitStrings.cv32]
  @scala.inline
  def cv33: typings.pdfkit.pdfkitStrings.cv33 = "cv33".asInstanceOf[typings.pdfkit.pdfkitStrings.cv33]
  @scala.inline
  def cv34: typings.pdfkit.pdfkitStrings.cv34 = "cv34".asInstanceOf[typings.pdfkit.pdfkitStrings.cv34]
  @scala.inline
  def cv35: typings.pdfkit.pdfkitStrings.cv35 = "cv35".asInstanceOf[typings.pdfkit.pdfkitStrings.cv35]
  @scala.inline
  def cv36: typings.pdfkit.pdfkitStrings.cv36 = "cv36".asInstanceOf[typings.pdfkit.pdfkitStrings.cv36]
  @scala.inline
  def cv37: typings.pdfkit.pdfkitStrings.cv37 = "cv37".asInstanceOf[typings.pdfkit.pdfkitStrings.cv37]
  @scala.inline
  def cv38: typings.pdfkit.pdfkitStrings.cv38 = "cv38".asInstanceOf[typings.pdfkit.pdfkitStrings.cv38]
  @scala.inline
  def cv39: typings.pdfkit.pdfkitStrings.cv39 = "cv39".asInstanceOf[typings.pdfkit.pdfkitStrings.cv39]
  @scala.inline
  def cv40: typings.pdfkit.pdfkitStrings.cv40 = "cv40".asInstanceOf[typings.pdfkit.pdfkitStrings.cv40]
  @scala.inline
  def cv41: typings.pdfkit.pdfkitStrings.cv41 = "cv41".asInstanceOf[typings.pdfkit.pdfkitStrings.cv41]
  @scala.inline
  def cv42: typings.pdfkit.pdfkitStrings.cv42 = "cv42".asInstanceOf[typings.pdfkit.pdfkitStrings.cv42]
  @scala.inline
  def cv43: typings.pdfkit.pdfkitStrings.cv43 = "cv43".asInstanceOf[typings.pdfkit.pdfkitStrings.cv43]
  @scala.inline
  def cv44: typings.pdfkit.pdfkitStrings.cv44 = "cv44".asInstanceOf[typings.pdfkit.pdfkitStrings.cv44]
  @scala.inline
  def cv45: typings.pdfkit.pdfkitStrings.cv45 = "cv45".asInstanceOf[typings.pdfkit.pdfkitStrings.cv45]
  @scala.inline
  def cv46: typings.pdfkit.pdfkitStrings.cv46 = "cv46".asInstanceOf[typings.pdfkit.pdfkitStrings.cv46]
  @scala.inline
  def cv47: typings.pdfkit.pdfkitStrings.cv47 = "cv47".asInstanceOf[typings.pdfkit.pdfkitStrings.cv47]
  @scala.inline
  def cv48: typings.pdfkit.pdfkitStrings.cv48 = "cv48".asInstanceOf[typings.pdfkit.pdfkitStrings.cv48]
  @scala.inline
  def cv49: typings.pdfkit.pdfkitStrings.cv49 = "cv49".asInstanceOf[typings.pdfkit.pdfkitStrings.cv49]
  @scala.inline
  def cv50: typings.pdfkit.pdfkitStrings.cv50 = "cv50".asInstanceOf[typings.pdfkit.pdfkitStrings.cv50]
  @scala.inline
  def cv51: typings.pdfkit.pdfkitStrings.cv51 = "cv51".asInstanceOf[typings.pdfkit.pdfkitStrings.cv51]
  @scala.inline
  def cv52: typings.pdfkit.pdfkitStrings.cv52 = "cv52".asInstanceOf[typings.pdfkit.pdfkitStrings.cv52]
  @scala.inline
  def cv53: typings.pdfkit.pdfkitStrings.cv53 = "cv53".asInstanceOf[typings.pdfkit.pdfkitStrings.cv53]
  @scala.inline
  def cv54: typings.pdfkit.pdfkitStrings.cv54 = "cv54".asInstanceOf[typings.pdfkit.pdfkitStrings.cv54]
  @scala.inline
  def cv55: typings.pdfkit.pdfkitStrings.cv55 = "cv55".asInstanceOf[typings.pdfkit.pdfkitStrings.cv55]
  @scala.inline
  def cv56: typings.pdfkit.pdfkitStrings.cv56 = "cv56".asInstanceOf[typings.pdfkit.pdfkitStrings.cv56]
  @scala.inline
  def cv57: typings.pdfkit.pdfkitStrings.cv57 = "cv57".asInstanceOf[typings.pdfkit.pdfkitStrings.cv57]
  @scala.inline
  def cv58: typings.pdfkit.pdfkitStrings.cv58 = "cv58".asInstanceOf[typings.pdfkit.pdfkitStrings.cv58]
  @scala.inline
  def cv59: typings.pdfkit.pdfkitStrings.cv59 = "cv59".asInstanceOf[typings.pdfkit.pdfkitStrings.cv59]
  @scala.inline
  def cv60: typings.pdfkit.pdfkitStrings.cv60 = "cv60".asInstanceOf[typings.pdfkit.pdfkitStrings.cv60]
  @scala.inline
  def cv61: typings.pdfkit.pdfkitStrings.cv61 = "cv61".asInstanceOf[typings.pdfkit.pdfkitStrings.cv61]
  @scala.inline
  def cv62: typings.pdfkit.pdfkitStrings.cv62 = "cv62".asInstanceOf[typings.pdfkit.pdfkitStrings.cv62]
  @scala.inline
  def cv63: typings.pdfkit.pdfkitStrings.cv63 = "cv63".asInstanceOf[typings.pdfkit.pdfkitStrings.cv63]
  @scala.inline
  def cv64: typings.pdfkit.pdfkitStrings.cv64 = "cv64".asInstanceOf[typings.pdfkit.pdfkitStrings.cv64]
  @scala.inline
  def cv65: typings.pdfkit.pdfkitStrings.cv65 = "cv65".asInstanceOf[typings.pdfkit.pdfkitStrings.cv65]
  @scala.inline
  def cv66: typings.pdfkit.pdfkitStrings.cv66 = "cv66".asInstanceOf[typings.pdfkit.pdfkitStrings.cv66]
  @scala.inline
  def cv67: typings.pdfkit.pdfkitStrings.cv67 = "cv67".asInstanceOf[typings.pdfkit.pdfkitStrings.cv67]
  @scala.inline
  def cv68: typings.pdfkit.pdfkitStrings.cv68 = "cv68".asInstanceOf[typings.pdfkit.pdfkitStrings.cv68]
  @scala.inline
  def cv69: typings.pdfkit.pdfkitStrings.cv69 = "cv69".asInstanceOf[typings.pdfkit.pdfkitStrings.cv69]
  @scala.inline
  def cv70: typings.pdfkit.pdfkitStrings.cv70 = "cv70".asInstanceOf[typings.pdfkit.pdfkitStrings.cv70]
  @scala.inline
  def cv71: typings.pdfkit.pdfkitStrings.cv71 = "cv71".asInstanceOf[typings.pdfkit.pdfkitStrings.cv71]
  @scala.inline
  def cv72: typings.pdfkit.pdfkitStrings.cv72 = "cv72".asInstanceOf[typings.pdfkit.pdfkitStrings.cv72]
  @scala.inline
  def cv73: typings.pdfkit.pdfkitStrings.cv73 = "cv73".asInstanceOf[typings.pdfkit.pdfkitStrings.cv73]
  @scala.inline
  def cv74: typings.pdfkit.pdfkitStrings.cv74 = "cv74".asInstanceOf[typings.pdfkit.pdfkitStrings.cv74]
  @scala.inline
  def cv75: typings.pdfkit.pdfkitStrings.cv75 = "cv75".asInstanceOf[typings.pdfkit.pdfkitStrings.cv75]
  @scala.inline
  def cv76: typings.pdfkit.pdfkitStrings.cv76 = "cv76".asInstanceOf[typings.pdfkit.pdfkitStrings.cv76]
  @scala.inline
  def cv77: typings.pdfkit.pdfkitStrings.cv77 = "cv77".asInstanceOf[typings.pdfkit.pdfkitStrings.cv77]
  @scala.inline
  def cv78: typings.pdfkit.pdfkitStrings.cv78 = "cv78".asInstanceOf[typings.pdfkit.pdfkitStrings.cv78]
  @scala.inline
  def cv79: typings.pdfkit.pdfkitStrings.cv79 = "cv79".asInstanceOf[typings.pdfkit.pdfkitStrings.cv79]
  @scala.inline
  def cv80: typings.pdfkit.pdfkitStrings.cv80 = "cv80".asInstanceOf[typings.pdfkit.pdfkitStrings.cv80]
  @scala.inline
  def cv81: typings.pdfkit.pdfkitStrings.cv81 = "cv81".asInstanceOf[typings.pdfkit.pdfkitStrings.cv81]
  @scala.inline
  def cv82: typings.pdfkit.pdfkitStrings.cv82 = "cv82".asInstanceOf[typings.pdfkit.pdfkitStrings.cv82]
  @scala.inline
  def cv83: typings.pdfkit.pdfkitStrings.cv83 = "cv83".asInstanceOf[typings.pdfkit.pdfkitStrings.cv83]
  @scala.inline
  def cv84: typings.pdfkit.pdfkitStrings.cv84 = "cv84".asInstanceOf[typings.pdfkit.pdfkitStrings.cv84]
  @scala.inline
  def cv85: typings.pdfkit.pdfkitStrings.cv85 = "cv85".asInstanceOf[typings.pdfkit.pdfkitStrings.cv85]
  @scala.inline
  def cv86: typings.pdfkit.pdfkitStrings.cv86 = "cv86".asInstanceOf[typings.pdfkit.pdfkitStrings.cv86]
  @scala.inline
  def cv87: typings.pdfkit.pdfkitStrings.cv87 = "cv87".asInstanceOf[typings.pdfkit.pdfkitStrings.cv87]
  @scala.inline
  def cv88: typings.pdfkit.pdfkitStrings.cv88 = "cv88".asInstanceOf[typings.pdfkit.pdfkitStrings.cv88]
  @scala.inline
  def cv89: typings.pdfkit.pdfkitStrings.cv89 = "cv89".asInstanceOf[typings.pdfkit.pdfkitStrings.cv89]
  @scala.inline
  def cv90: typings.pdfkit.pdfkitStrings.cv90 = "cv90".asInstanceOf[typings.pdfkit.pdfkitStrings.cv90]
  @scala.inline
  def cv91: typings.pdfkit.pdfkitStrings.cv91 = "cv91".asInstanceOf[typings.pdfkit.pdfkitStrings.cv91]
  @scala.inline
  def cv92: typings.pdfkit.pdfkitStrings.cv92 = "cv92".asInstanceOf[typings.pdfkit.pdfkitStrings.cv92]
  @scala.inline
  def cv93: typings.pdfkit.pdfkitStrings.cv93 = "cv93".asInstanceOf[typings.pdfkit.pdfkitStrings.cv93]
  @scala.inline
  def cv94: typings.pdfkit.pdfkitStrings.cv94 = "cv94".asInstanceOf[typings.pdfkit.pdfkitStrings.cv94]
  @scala.inline
  def cv95: typings.pdfkit.pdfkitStrings.cv95 = "cv95".asInstanceOf[typings.pdfkit.pdfkitStrings.cv95]
  @scala.inline
  def cv96: typings.pdfkit.pdfkitStrings.cv96 = "cv96".asInstanceOf[typings.pdfkit.pdfkitStrings.cv96]
  @scala.inline
  def cv97: typings.pdfkit.pdfkitStrings.cv97 = "cv97".asInstanceOf[typings.pdfkit.pdfkitStrings.cv97]
  @scala.inline
  def cv98: typings.pdfkit.pdfkitStrings.cv98 = "cv98".asInstanceOf[typings.pdfkit.pdfkitStrings.cv98]
  @scala.inline
  def cv99: typings.pdfkit.pdfkitStrings.cv99 = "cv99".asInstanceOf[typings.pdfkit.pdfkitStrings.cv99]
  @scala.inline
  def dist: typings.pdfkit.pdfkitStrings.dist = "dist".asInstanceOf[typings.pdfkit.pdfkitStrings.dist]
  @scala.inline
  def dlig: typings.pdfkit.pdfkitStrings.dlig = "dlig".asInstanceOf[typings.pdfkit.pdfkitStrings.dlig]
  @scala.inline
  def dnom: typings.pdfkit.pdfkitStrings.dnom = "dnom".asInstanceOf[typings.pdfkit.pdfkitStrings.dnom]
  @scala.inline
  def dtls: typings.pdfkit.pdfkitStrings.dtls = "dtls".asInstanceOf[typings.pdfkit.pdfkitStrings.dtls]
  @scala.inline
  def expt: typings.pdfkit.pdfkitStrings.expt = "expt".asInstanceOf[typings.pdfkit.pdfkitStrings.expt]
  @scala.inline
  def falt: typings.pdfkit.pdfkitStrings.falt = "falt".asInstanceOf[typings.pdfkit.pdfkitStrings.falt]
  @scala.inline
  def fin2: typings.pdfkit.pdfkitStrings.fin2 = "fin2".asInstanceOf[typings.pdfkit.pdfkitStrings.fin2]
  @scala.inline
  def fin3: typings.pdfkit.pdfkitStrings.fin3 = "fin3".asInstanceOf[typings.pdfkit.pdfkitStrings.fin3]
  @scala.inline
  def fina: typings.pdfkit.pdfkitStrings.fina = "fina".asInstanceOf[typings.pdfkit.pdfkitStrings.fina]
  @scala.inline
  def flac: typings.pdfkit.pdfkitStrings.flac = "flac".asInstanceOf[typings.pdfkit.pdfkitStrings.flac]
  @scala.inline
  def frac: typings.pdfkit.pdfkitStrings.frac = "frac".asInstanceOf[typings.pdfkit.pdfkitStrings.frac]
  @scala.inline
  def fwid: typings.pdfkit.pdfkitStrings.fwid = "fwid".asInstanceOf[typings.pdfkit.pdfkitStrings.fwid]
  @scala.inline
  def half: typings.pdfkit.pdfkitStrings.half = "half".asInstanceOf[typings.pdfkit.pdfkitStrings.half]
  @scala.inline
  def haln: typings.pdfkit.pdfkitStrings.haln = "haln".asInstanceOf[typings.pdfkit.pdfkitStrings.haln]
  @scala.inline
  def halt: typings.pdfkit.pdfkitStrings.halt = "halt".asInstanceOf[typings.pdfkit.pdfkitStrings.halt]
  @scala.inline
  def hist: typings.pdfkit.pdfkitStrings.hist = "hist".asInstanceOf[typings.pdfkit.pdfkitStrings.hist]
  @scala.inline
  def hkna: typings.pdfkit.pdfkitStrings.hkna = "hkna".asInstanceOf[typings.pdfkit.pdfkitStrings.hkna]
  @scala.inline
  def hlig: typings.pdfkit.pdfkitStrings.hlig = "hlig".asInstanceOf[typings.pdfkit.pdfkitStrings.hlig]
  @scala.inline
  def hngl: typings.pdfkit.pdfkitStrings.hngl = "hngl".asInstanceOf[typings.pdfkit.pdfkitStrings.hngl]
  @scala.inline
  def hojo: typings.pdfkit.pdfkitStrings.hojo = "hojo".asInstanceOf[typings.pdfkit.pdfkitStrings.hojo]
  @scala.inline
  def hwid: typings.pdfkit.pdfkitStrings.hwid = "hwid".asInstanceOf[typings.pdfkit.pdfkitStrings.hwid]
  @scala.inline
  def init: typings.pdfkit.pdfkitStrings.init = "init".asInstanceOf[typings.pdfkit.pdfkitStrings.init]
  @scala.inline
  def isol: typings.pdfkit.pdfkitStrings.isol = "isol".asInstanceOf[typings.pdfkit.pdfkitStrings.isol]
  @scala.inline
  def ital: typings.pdfkit.pdfkitStrings.ital = "ital".asInstanceOf[typings.pdfkit.pdfkitStrings.ital]
  @scala.inline
  def jalt: typings.pdfkit.pdfkitStrings.jalt = "jalt".asInstanceOf[typings.pdfkit.pdfkitStrings.jalt]
  @scala.inline
  def jp04: typings.pdfkit.pdfkitStrings.jp04 = "jp04".asInstanceOf[typings.pdfkit.pdfkitStrings.jp04]
  @scala.inline
  def jp78: typings.pdfkit.pdfkitStrings.jp78 = "jp78".asInstanceOf[typings.pdfkit.pdfkitStrings.jp78]
  @scala.inline
  def jp83: typings.pdfkit.pdfkitStrings.jp83 = "jp83".asInstanceOf[typings.pdfkit.pdfkitStrings.jp83]
  @scala.inline
  def jp90: typings.pdfkit.pdfkitStrings.jp90 = "jp90".asInstanceOf[typings.pdfkit.pdfkitStrings.jp90]
  @scala.inline
  def kern: typings.pdfkit.pdfkitStrings.kern = "kern".asInstanceOf[typings.pdfkit.pdfkitStrings.kern]
  @scala.inline
  def lfbd: typings.pdfkit.pdfkitStrings.lfbd = "lfbd".asInstanceOf[typings.pdfkit.pdfkitStrings.lfbd]
  @scala.inline
  def liga: typings.pdfkit.pdfkitStrings.liga = "liga".asInstanceOf[typings.pdfkit.pdfkitStrings.liga]
  @scala.inline
  def ljmo: typings.pdfkit.pdfkitStrings.ljmo = "ljmo".asInstanceOf[typings.pdfkit.pdfkitStrings.ljmo]
  @scala.inline
  def lnum: typings.pdfkit.pdfkitStrings.lnum = "lnum".asInstanceOf[typings.pdfkit.pdfkitStrings.lnum]
  @scala.inline
  def locl: typings.pdfkit.pdfkitStrings.locl = "locl".asInstanceOf[typings.pdfkit.pdfkitStrings.locl]
  @scala.inline
  def ltra: typings.pdfkit.pdfkitStrings.ltra = "ltra".asInstanceOf[typings.pdfkit.pdfkitStrings.ltra]
  @scala.inline
  def ltrm: typings.pdfkit.pdfkitStrings.ltrm = "ltrm".asInstanceOf[typings.pdfkit.pdfkitStrings.ltrm]
  @scala.inline
  def mark: typings.pdfkit.pdfkitStrings.mark = "mark".asInstanceOf[typings.pdfkit.pdfkitStrings.mark]
  @scala.inline
  def med2: typings.pdfkit.pdfkitStrings.med2 = "med2".asInstanceOf[typings.pdfkit.pdfkitStrings.med2]
  @scala.inline
  def medi: typings.pdfkit.pdfkitStrings.medi = "medi".asInstanceOf[typings.pdfkit.pdfkitStrings.medi]
  @scala.inline
  def mgrk: typings.pdfkit.pdfkitStrings.mgrk = "mgrk".asInstanceOf[typings.pdfkit.pdfkitStrings.mgrk]
  @scala.inline
  def mkmk: typings.pdfkit.pdfkitStrings.mkmk = "mkmk".asInstanceOf[typings.pdfkit.pdfkitStrings.mkmk]
  @scala.inline
  def mset: typings.pdfkit.pdfkitStrings.mset = "mset".asInstanceOf[typings.pdfkit.pdfkitStrings.mset]
  @scala.inline
  def nalt: typings.pdfkit.pdfkitStrings.nalt = "nalt".asInstanceOf[typings.pdfkit.pdfkitStrings.nalt]
  @scala.inline
  def nlck: typings.pdfkit.pdfkitStrings.nlck = "nlck".asInstanceOf[typings.pdfkit.pdfkitStrings.nlck]
  @scala.inline
  def nukt: typings.pdfkit.pdfkitStrings.nukt = "nukt".asInstanceOf[typings.pdfkit.pdfkitStrings.nukt]
  @scala.inline
  def numr: typings.pdfkit.pdfkitStrings.numr = "numr".asInstanceOf[typings.pdfkit.pdfkitStrings.numr]
  @scala.inline
  def onum: typings.pdfkit.pdfkitStrings.onum = "onum".asInstanceOf[typings.pdfkit.pdfkitStrings.onum]
  @scala.inline
  def opbd: typings.pdfkit.pdfkitStrings.opbd = "opbd".asInstanceOf[typings.pdfkit.pdfkitStrings.opbd]
  @scala.inline
  def ordn: typings.pdfkit.pdfkitStrings.ordn = "ordn".asInstanceOf[typings.pdfkit.pdfkitStrings.ordn]
  @scala.inline
  def ornm: typings.pdfkit.pdfkitStrings.ornm = "ornm".asInstanceOf[typings.pdfkit.pdfkitStrings.ornm]
  @scala.inline
  def palt: typings.pdfkit.pdfkitStrings.palt = "palt".asInstanceOf[typings.pdfkit.pdfkitStrings.palt]
  @scala.inline
  def pcap: typings.pdfkit.pdfkitStrings.pcap = "pcap".asInstanceOf[typings.pdfkit.pdfkitStrings.pcap]
  @scala.inline
  def pkna: typings.pdfkit.pdfkitStrings.pkna = "pkna".asInstanceOf[typings.pdfkit.pdfkitStrings.pkna]
  @scala.inline
  def pnum: typings.pdfkit.pdfkitStrings.pnum = "pnum".asInstanceOf[typings.pdfkit.pdfkitStrings.pnum]
  @scala.inline
  def pref: typings.pdfkit.pdfkitStrings.pref = "pref".asInstanceOf[typings.pdfkit.pdfkitStrings.pref]
  @scala.inline
  def pres: typings.pdfkit.pdfkitStrings.pres = "pres".asInstanceOf[typings.pdfkit.pdfkitStrings.pres]
  @scala.inline
  def pstf: typings.pdfkit.pdfkitStrings.pstf = "pstf".asInstanceOf[typings.pdfkit.pdfkitStrings.pstf]
  @scala.inline
  def psts: typings.pdfkit.pdfkitStrings.psts = "psts".asInstanceOf[typings.pdfkit.pdfkitStrings.psts]
  @scala.inline
  def pwid: typings.pdfkit.pdfkitStrings.pwid = "pwid".asInstanceOf[typings.pdfkit.pdfkitStrings.pwid]
  @scala.inline
  def qwid: typings.pdfkit.pdfkitStrings.qwid = "qwid".asInstanceOf[typings.pdfkit.pdfkitStrings.qwid]
  @scala.inline
  def rand: typings.pdfkit.pdfkitStrings.rand = "rand".asInstanceOf[typings.pdfkit.pdfkitStrings.rand]
  @scala.inline
  def rclt: typings.pdfkit.pdfkitStrings.rclt = "rclt".asInstanceOf[typings.pdfkit.pdfkitStrings.rclt]
  @scala.inline
  def rkrf: typings.pdfkit.pdfkitStrings.rkrf = "rkrf".asInstanceOf[typings.pdfkit.pdfkitStrings.rkrf]
  @scala.inline
  def rlig: typings.pdfkit.pdfkitStrings.rlig = "rlig".asInstanceOf[typings.pdfkit.pdfkitStrings.rlig]
  @scala.inline
  def rphf: typings.pdfkit.pdfkitStrings.rphf = "rphf".asInstanceOf[typings.pdfkit.pdfkitStrings.rphf]
  @scala.inline
  def rtbd: typings.pdfkit.pdfkitStrings.rtbd = "rtbd".asInstanceOf[typings.pdfkit.pdfkitStrings.rtbd]
  @scala.inline
  def rtla: typings.pdfkit.pdfkitStrings.rtla = "rtla".asInstanceOf[typings.pdfkit.pdfkitStrings.rtla]
  @scala.inline
  def rtlm: typings.pdfkit.pdfkitStrings.rtlm = "rtlm".asInstanceOf[typings.pdfkit.pdfkitStrings.rtlm]
  @scala.inline
  def ruby: typings.pdfkit.pdfkitStrings.ruby = "ruby".asInstanceOf[typings.pdfkit.pdfkitStrings.ruby]
  @scala.inline
  def rvrn: typings.pdfkit.pdfkitStrings.rvrn = "rvrn".asInstanceOf[typings.pdfkit.pdfkitStrings.rvrn]
  @scala.inline
  def salt: typings.pdfkit.pdfkitStrings.salt = "salt".asInstanceOf[typings.pdfkit.pdfkitStrings.salt]
  @scala.inline
  def sinf: typings.pdfkit.pdfkitStrings.sinf = "sinf".asInstanceOf[typings.pdfkit.pdfkitStrings.sinf]
  @scala.inline
  def size: typings.pdfkit.pdfkitStrings.size = "size".asInstanceOf[typings.pdfkit.pdfkitStrings.size]
  @scala.inline
  def smcp: typings.pdfkit.pdfkitStrings.smcp = "smcp".asInstanceOf[typings.pdfkit.pdfkitStrings.smcp]
  @scala.inline
  def smpl: typings.pdfkit.pdfkitStrings.smpl = "smpl".asInstanceOf[typings.pdfkit.pdfkitStrings.smpl]
  @scala.inline
  def ss01: typings.pdfkit.pdfkitStrings.ss01 = "ss01".asInstanceOf[typings.pdfkit.pdfkitStrings.ss01]
  @scala.inline
  def ss02: typings.pdfkit.pdfkitStrings.ss02 = "ss02".asInstanceOf[typings.pdfkit.pdfkitStrings.ss02]
  @scala.inline
  def ss03: typings.pdfkit.pdfkitStrings.ss03 = "ss03".asInstanceOf[typings.pdfkit.pdfkitStrings.ss03]
  @scala.inline
  def ss04: typings.pdfkit.pdfkitStrings.ss04 = "ss04".asInstanceOf[typings.pdfkit.pdfkitStrings.ss04]
  @scala.inline
  def ss05: typings.pdfkit.pdfkitStrings.ss05 = "ss05".asInstanceOf[typings.pdfkit.pdfkitStrings.ss05]
  @scala.inline
  def ss06: typings.pdfkit.pdfkitStrings.ss06 = "ss06".asInstanceOf[typings.pdfkit.pdfkitStrings.ss06]
  @scala.inline
  def ss07: typings.pdfkit.pdfkitStrings.ss07 = "ss07".asInstanceOf[typings.pdfkit.pdfkitStrings.ss07]
  @scala.inline
  def ss08: typings.pdfkit.pdfkitStrings.ss08 = "ss08".asInstanceOf[typings.pdfkit.pdfkitStrings.ss08]
  @scala.inline
  def ss09: typings.pdfkit.pdfkitStrings.ss09 = "ss09".asInstanceOf[typings.pdfkit.pdfkitStrings.ss09]
  @scala.inline
  def ss10: typings.pdfkit.pdfkitStrings.ss10 = "ss10".asInstanceOf[typings.pdfkit.pdfkitStrings.ss10]
  @scala.inline
  def ss11: typings.pdfkit.pdfkitStrings.ss11 = "ss11".asInstanceOf[typings.pdfkit.pdfkitStrings.ss11]
  @scala.inline
  def ss12: typings.pdfkit.pdfkitStrings.ss12 = "ss12".asInstanceOf[typings.pdfkit.pdfkitStrings.ss12]
  @scala.inline
  def ss13: typings.pdfkit.pdfkitStrings.ss13 = "ss13".asInstanceOf[typings.pdfkit.pdfkitStrings.ss13]
  @scala.inline
  def ss14: typings.pdfkit.pdfkitStrings.ss14 = "ss14".asInstanceOf[typings.pdfkit.pdfkitStrings.ss14]
  @scala.inline
  def ss15: typings.pdfkit.pdfkitStrings.ss15 = "ss15".asInstanceOf[typings.pdfkit.pdfkitStrings.ss15]
  @scala.inline
  def ss16: typings.pdfkit.pdfkitStrings.ss16 = "ss16".asInstanceOf[typings.pdfkit.pdfkitStrings.ss16]
  @scala.inline
  def ss17: typings.pdfkit.pdfkitStrings.ss17 = "ss17".asInstanceOf[typings.pdfkit.pdfkitStrings.ss17]
  @scala.inline
  def ss18: typings.pdfkit.pdfkitStrings.ss18 = "ss18".asInstanceOf[typings.pdfkit.pdfkitStrings.ss18]
  @scala.inline
  def ss19: typings.pdfkit.pdfkitStrings.ss19 = "ss19".asInstanceOf[typings.pdfkit.pdfkitStrings.ss19]
  @scala.inline
  def ss20: typings.pdfkit.pdfkitStrings.ss20 = "ss20".asInstanceOf[typings.pdfkit.pdfkitStrings.ss20]
  @scala.inline
  def ssty: typings.pdfkit.pdfkitStrings.ssty = "ssty".asInstanceOf[typings.pdfkit.pdfkitStrings.ssty]
  @scala.inline
  def stch: typings.pdfkit.pdfkitStrings.stch = "stch".asInstanceOf[typings.pdfkit.pdfkitStrings.stch]
  @scala.inline
  def subs: typings.pdfkit.pdfkitStrings.subs = "subs".asInstanceOf[typings.pdfkit.pdfkitStrings.subs]
  @scala.inline
  def sups: typings.pdfkit.pdfkitStrings.sups = "sups".asInstanceOf[typings.pdfkit.pdfkitStrings.sups]
  @scala.inline
  def swsh: typings.pdfkit.pdfkitStrings.swsh = "swsh".asInstanceOf[typings.pdfkit.pdfkitStrings.swsh]
  @scala.inline
  def titl: typings.pdfkit.pdfkitStrings.titl = "titl".asInstanceOf[typings.pdfkit.pdfkitStrings.titl]
  @scala.inline
  def tjmo: typings.pdfkit.pdfkitStrings.tjmo = "tjmo".asInstanceOf[typings.pdfkit.pdfkitStrings.tjmo]
  @scala.inline
  def tnam: typings.pdfkit.pdfkitStrings.tnam = "tnam".asInstanceOf[typings.pdfkit.pdfkitStrings.tnam]
  @scala.inline
  def tnum: typings.pdfkit.pdfkitStrings.tnum = "tnum".asInstanceOf[typings.pdfkit.pdfkitStrings.tnum]
  @scala.inline
  def trad: typings.pdfkit.pdfkitStrings.trad = "trad".asInstanceOf[typings.pdfkit.pdfkitStrings.trad]
  @scala.inline
  def twid: typings.pdfkit.pdfkitStrings.twid = "twid".asInstanceOf[typings.pdfkit.pdfkitStrings.twid]
  @scala.inline
  def unic: typings.pdfkit.pdfkitStrings.unic = "unic".asInstanceOf[typings.pdfkit.pdfkitStrings.unic]
  @scala.inline
  def valt: typings.pdfkit.pdfkitStrings.valt = "valt".asInstanceOf[typings.pdfkit.pdfkitStrings.valt]
  @scala.inline
  def vatu: typings.pdfkit.pdfkitStrings.vatu = "vatu".asInstanceOf[typings.pdfkit.pdfkitStrings.vatu]
  @scala.inline
  def vert: typings.pdfkit.pdfkitStrings.vert = "vert".asInstanceOf[typings.pdfkit.pdfkitStrings.vert]
  @scala.inline
  def vhal: typings.pdfkit.pdfkitStrings.vhal = "vhal".asInstanceOf[typings.pdfkit.pdfkitStrings.vhal]
  @scala.inline
  def vjmo: typings.pdfkit.pdfkitStrings.vjmo = "vjmo".asInstanceOf[typings.pdfkit.pdfkitStrings.vjmo]
  @scala.inline
  def vkna: typings.pdfkit.pdfkitStrings.vkna = "vkna".asInstanceOf[typings.pdfkit.pdfkitStrings.vkna]
  @scala.inline
  def vkrn: typings.pdfkit.pdfkitStrings.vkrn = "vkrn".asInstanceOf[typings.pdfkit.pdfkitStrings.vkrn]
  @scala.inline
  def vpal: typings.pdfkit.pdfkitStrings.vpal = "vpal".asInstanceOf[typings.pdfkit.pdfkitStrings.vpal]
  @scala.inline
  def vrt2: typings.pdfkit.pdfkitStrings.vrt2 = "vrt2".asInstanceOf[typings.pdfkit.pdfkitStrings.vrt2]
  @scala.inline
  def vrtr: typings.pdfkit.pdfkitStrings.vrtr = "vrtr".asInstanceOf[typings.pdfkit.pdfkitStrings.vrtr]
  @scala.inline
  def zero: typings.pdfkit.pdfkitStrings.zero = "zero".asInstanceOf[typings.pdfkit.pdfkitStrings.zero]
}

