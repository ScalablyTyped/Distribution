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
  def aalt: typings.pdfkit.pdfkitStrings.aalt = this.cast("aalt")
  @scala.inline
  def abvf: typings.pdfkit.pdfkitStrings.abvf = this.cast("abvf")
  @scala.inline
  def abvm: typings.pdfkit.pdfkitStrings.abvm = this.cast("abvm")
  @scala.inline
  def abvs: typings.pdfkit.pdfkitStrings.abvs = this.cast("abvs")
  @scala.inline
  def afrc: typings.pdfkit.pdfkitStrings.afrc = this.cast("afrc")
  @scala.inline
  def akhn: typings.pdfkit.pdfkitStrings.akhn = this.cast("akhn")
  @scala.inline
  def blwf: typings.pdfkit.pdfkitStrings.blwf = this.cast("blwf")
  @scala.inline
  def blwm: typings.pdfkit.pdfkitStrings.blwm = this.cast("blwm")
  @scala.inline
  def blws: typings.pdfkit.pdfkitStrings.blws = this.cast("blws")
  @scala.inline
  def c2pc: typings.pdfkit.pdfkitStrings.c2pc = this.cast("c2pc")
  @scala.inline
  def c2sc: typings.pdfkit.pdfkitStrings.c2sc = this.cast("c2sc")
  @scala.inline
  def calt: typings.pdfkit.pdfkitStrings.calt = this.cast("calt")
  @scala.inline
  def `case`: typings.pdfkit.pdfkitStrings.`case` = this.cast("case")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ccmp: typings.pdfkit.pdfkitStrings.ccmp = this.cast("ccmp")
  @scala.inline
  def cfar: typings.pdfkit.pdfkitStrings.cfar = this.cast("cfar")
  @scala.inline
  def cjct: typings.pdfkit.pdfkitStrings.cjct = this.cast("cjct")
  @scala.inline
  def clig: typings.pdfkit.pdfkitStrings.clig = this.cast("clig")
  @scala.inline
  def cpct: typings.pdfkit.pdfkitStrings.cpct = this.cast("cpct")
  @scala.inline
  def cpsp: typings.pdfkit.pdfkitStrings.cpsp = this.cast("cpsp")
  @scala.inline
  def cswh: typings.pdfkit.pdfkitStrings.cswh = this.cast("cswh")
  @scala.inline
  def curs: typings.pdfkit.pdfkitStrings.curs = this.cast("curs")
  @scala.inline
  def cv01: typings.pdfkit.pdfkitStrings.cv01 = this.cast("cv01")
  @scala.inline
  def cv02: typings.pdfkit.pdfkitStrings.cv02 = this.cast("cv02")
  @scala.inline
  def cv03: typings.pdfkit.pdfkitStrings.cv03 = this.cast("cv03")
  @scala.inline
  def cv04: typings.pdfkit.pdfkitStrings.cv04 = this.cast("cv04")
  @scala.inline
  def cv05: typings.pdfkit.pdfkitStrings.cv05 = this.cast("cv05")
  @scala.inline
  def cv06: typings.pdfkit.pdfkitStrings.cv06 = this.cast("cv06")
  @scala.inline
  def cv07: typings.pdfkit.pdfkitStrings.cv07 = this.cast("cv07")
  @scala.inline
  def cv08: typings.pdfkit.pdfkitStrings.cv08 = this.cast("cv08")
  @scala.inline
  def cv09: typings.pdfkit.pdfkitStrings.cv09 = this.cast("cv09")
  @scala.inline
  def cv10: typings.pdfkit.pdfkitStrings.cv10 = this.cast("cv10")
  @scala.inline
  def cv11: typings.pdfkit.pdfkitStrings.cv11 = this.cast("cv11")
  @scala.inline
  def cv12: typings.pdfkit.pdfkitStrings.cv12 = this.cast("cv12")
  @scala.inline
  def cv13: typings.pdfkit.pdfkitStrings.cv13 = this.cast("cv13")
  @scala.inline
  def cv14: typings.pdfkit.pdfkitStrings.cv14 = this.cast("cv14")
  @scala.inline
  def cv15: typings.pdfkit.pdfkitStrings.cv15 = this.cast("cv15")
  @scala.inline
  def cv16: typings.pdfkit.pdfkitStrings.cv16 = this.cast("cv16")
  @scala.inline
  def cv17: typings.pdfkit.pdfkitStrings.cv17 = this.cast("cv17")
  @scala.inline
  def cv18: typings.pdfkit.pdfkitStrings.cv18 = this.cast("cv18")
  @scala.inline
  def cv19: typings.pdfkit.pdfkitStrings.cv19 = this.cast("cv19")
  @scala.inline
  def cv20: typings.pdfkit.pdfkitStrings.cv20 = this.cast("cv20")
  @scala.inline
  def cv21: typings.pdfkit.pdfkitStrings.cv21 = this.cast("cv21")
  @scala.inline
  def cv22: typings.pdfkit.pdfkitStrings.cv22 = this.cast("cv22")
  @scala.inline
  def cv23: typings.pdfkit.pdfkitStrings.cv23 = this.cast("cv23")
  @scala.inline
  def cv24: typings.pdfkit.pdfkitStrings.cv24 = this.cast("cv24")
  @scala.inline
  def cv25: typings.pdfkit.pdfkitStrings.cv25 = this.cast("cv25")
  @scala.inline
  def cv26: typings.pdfkit.pdfkitStrings.cv26 = this.cast("cv26")
  @scala.inline
  def cv27: typings.pdfkit.pdfkitStrings.cv27 = this.cast("cv27")
  @scala.inline
  def cv28: typings.pdfkit.pdfkitStrings.cv28 = this.cast("cv28")
  @scala.inline
  def cv29: typings.pdfkit.pdfkitStrings.cv29 = this.cast("cv29")
  @scala.inline
  def cv30: typings.pdfkit.pdfkitStrings.cv30 = this.cast("cv30")
  @scala.inline
  def cv31: typings.pdfkit.pdfkitStrings.cv31 = this.cast("cv31")
  @scala.inline
  def cv32: typings.pdfkit.pdfkitStrings.cv32 = this.cast("cv32")
  @scala.inline
  def cv33: typings.pdfkit.pdfkitStrings.cv33 = this.cast("cv33")
  @scala.inline
  def cv34: typings.pdfkit.pdfkitStrings.cv34 = this.cast("cv34")
  @scala.inline
  def cv35: typings.pdfkit.pdfkitStrings.cv35 = this.cast("cv35")
  @scala.inline
  def cv36: typings.pdfkit.pdfkitStrings.cv36 = this.cast("cv36")
  @scala.inline
  def cv37: typings.pdfkit.pdfkitStrings.cv37 = this.cast("cv37")
  @scala.inline
  def cv38: typings.pdfkit.pdfkitStrings.cv38 = this.cast("cv38")
  @scala.inline
  def cv39: typings.pdfkit.pdfkitStrings.cv39 = this.cast("cv39")
  @scala.inline
  def cv40: typings.pdfkit.pdfkitStrings.cv40 = this.cast("cv40")
  @scala.inline
  def cv41: typings.pdfkit.pdfkitStrings.cv41 = this.cast("cv41")
  @scala.inline
  def cv42: typings.pdfkit.pdfkitStrings.cv42 = this.cast("cv42")
  @scala.inline
  def cv43: typings.pdfkit.pdfkitStrings.cv43 = this.cast("cv43")
  @scala.inline
  def cv44: typings.pdfkit.pdfkitStrings.cv44 = this.cast("cv44")
  @scala.inline
  def cv45: typings.pdfkit.pdfkitStrings.cv45 = this.cast("cv45")
  @scala.inline
  def cv46: typings.pdfkit.pdfkitStrings.cv46 = this.cast("cv46")
  @scala.inline
  def cv47: typings.pdfkit.pdfkitStrings.cv47 = this.cast("cv47")
  @scala.inline
  def cv48: typings.pdfkit.pdfkitStrings.cv48 = this.cast("cv48")
  @scala.inline
  def cv49: typings.pdfkit.pdfkitStrings.cv49 = this.cast("cv49")
  @scala.inline
  def cv50: typings.pdfkit.pdfkitStrings.cv50 = this.cast("cv50")
  @scala.inline
  def cv51: typings.pdfkit.pdfkitStrings.cv51 = this.cast("cv51")
  @scala.inline
  def cv52: typings.pdfkit.pdfkitStrings.cv52 = this.cast("cv52")
  @scala.inline
  def cv53: typings.pdfkit.pdfkitStrings.cv53 = this.cast("cv53")
  @scala.inline
  def cv54: typings.pdfkit.pdfkitStrings.cv54 = this.cast("cv54")
  @scala.inline
  def cv55: typings.pdfkit.pdfkitStrings.cv55 = this.cast("cv55")
  @scala.inline
  def cv56: typings.pdfkit.pdfkitStrings.cv56 = this.cast("cv56")
  @scala.inline
  def cv57: typings.pdfkit.pdfkitStrings.cv57 = this.cast("cv57")
  @scala.inline
  def cv58: typings.pdfkit.pdfkitStrings.cv58 = this.cast("cv58")
  @scala.inline
  def cv59: typings.pdfkit.pdfkitStrings.cv59 = this.cast("cv59")
  @scala.inline
  def cv60: typings.pdfkit.pdfkitStrings.cv60 = this.cast("cv60")
  @scala.inline
  def cv61: typings.pdfkit.pdfkitStrings.cv61 = this.cast("cv61")
  @scala.inline
  def cv62: typings.pdfkit.pdfkitStrings.cv62 = this.cast("cv62")
  @scala.inline
  def cv63: typings.pdfkit.pdfkitStrings.cv63 = this.cast("cv63")
  @scala.inline
  def cv64: typings.pdfkit.pdfkitStrings.cv64 = this.cast("cv64")
  @scala.inline
  def cv65: typings.pdfkit.pdfkitStrings.cv65 = this.cast("cv65")
  @scala.inline
  def cv66: typings.pdfkit.pdfkitStrings.cv66 = this.cast("cv66")
  @scala.inline
  def cv67: typings.pdfkit.pdfkitStrings.cv67 = this.cast("cv67")
  @scala.inline
  def cv68: typings.pdfkit.pdfkitStrings.cv68 = this.cast("cv68")
  @scala.inline
  def cv69: typings.pdfkit.pdfkitStrings.cv69 = this.cast("cv69")
  @scala.inline
  def cv70: typings.pdfkit.pdfkitStrings.cv70 = this.cast("cv70")
  @scala.inline
  def cv71: typings.pdfkit.pdfkitStrings.cv71 = this.cast("cv71")
  @scala.inline
  def cv72: typings.pdfkit.pdfkitStrings.cv72 = this.cast("cv72")
  @scala.inline
  def cv73: typings.pdfkit.pdfkitStrings.cv73 = this.cast("cv73")
  @scala.inline
  def cv74: typings.pdfkit.pdfkitStrings.cv74 = this.cast("cv74")
  @scala.inline
  def cv75: typings.pdfkit.pdfkitStrings.cv75 = this.cast("cv75")
  @scala.inline
  def cv76: typings.pdfkit.pdfkitStrings.cv76 = this.cast("cv76")
  @scala.inline
  def cv77: typings.pdfkit.pdfkitStrings.cv77 = this.cast("cv77")
  @scala.inline
  def cv78: typings.pdfkit.pdfkitStrings.cv78 = this.cast("cv78")
  @scala.inline
  def cv79: typings.pdfkit.pdfkitStrings.cv79 = this.cast("cv79")
  @scala.inline
  def cv80: typings.pdfkit.pdfkitStrings.cv80 = this.cast("cv80")
  @scala.inline
  def cv81: typings.pdfkit.pdfkitStrings.cv81 = this.cast("cv81")
  @scala.inline
  def cv82: typings.pdfkit.pdfkitStrings.cv82 = this.cast("cv82")
  @scala.inline
  def cv83: typings.pdfkit.pdfkitStrings.cv83 = this.cast("cv83")
  @scala.inline
  def cv84: typings.pdfkit.pdfkitStrings.cv84 = this.cast("cv84")
  @scala.inline
  def cv85: typings.pdfkit.pdfkitStrings.cv85 = this.cast("cv85")
  @scala.inline
  def cv86: typings.pdfkit.pdfkitStrings.cv86 = this.cast("cv86")
  @scala.inline
  def cv87: typings.pdfkit.pdfkitStrings.cv87 = this.cast("cv87")
  @scala.inline
  def cv88: typings.pdfkit.pdfkitStrings.cv88 = this.cast("cv88")
  @scala.inline
  def cv89: typings.pdfkit.pdfkitStrings.cv89 = this.cast("cv89")
  @scala.inline
  def cv90: typings.pdfkit.pdfkitStrings.cv90 = this.cast("cv90")
  @scala.inline
  def cv91: typings.pdfkit.pdfkitStrings.cv91 = this.cast("cv91")
  @scala.inline
  def cv92: typings.pdfkit.pdfkitStrings.cv92 = this.cast("cv92")
  @scala.inline
  def cv93: typings.pdfkit.pdfkitStrings.cv93 = this.cast("cv93")
  @scala.inline
  def cv94: typings.pdfkit.pdfkitStrings.cv94 = this.cast("cv94")
  @scala.inline
  def cv95: typings.pdfkit.pdfkitStrings.cv95 = this.cast("cv95")
  @scala.inline
  def cv96: typings.pdfkit.pdfkitStrings.cv96 = this.cast("cv96")
  @scala.inline
  def cv97: typings.pdfkit.pdfkitStrings.cv97 = this.cast("cv97")
  @scala.inline
  def cv98: typings.pdfkit.pdfkitStrings.cv98 = this.cast("cv98")
  @scala.inline
  def cv99: typings.pdfkit.pdfkitStrings.cv99 = this.cast("cv99")
  @scala.inline
  def dist: typings.pdfkit.pdfkitStrings.dist = this.cast("dist")
  @scala.inline
  def dlig: typings.pdfkit.pdfkitStrings.dlig = this.cast("dlig")
  @scala.inline
  def dnom: typings.pdfkit.pdfkitStrings.dnom = this.cast("dnom")
  @scala.inline
  def dtls: typings.pdfkit.pdfkitStrings.dtls = this.cast("dtls")
  @scala.inline
  def expt: typings.pdfkit.pdfkitStrings.expt = this.cast("expt")
  @scala.inline
  def falt: typings.pdfkit.pdfkitStrings.falt = this.cast("falt")
  @scala.inline
  def fin2: typings.pdfkit.pdfkitStrings.fin2 = this.cast("fin2")
  @scala.inline
  def fin3: typings.pdfkit.pdfkitStrings.fin3 = this.cast("fin3")
  @scala.inline
  def fina: typings.pdfkit.pdfkitStrings.fina = this.cast("fina")
  @scala.inline
  def flac: typings.pdfkit.pdfkitStrings.flac = this.cast("flac")
  @scala.inline
  def frac: typings.pdfkit.pdfkitStrings.frac = this.cast("frac")
  @scala.inline
  def fwid: typings.pdfkit.pdfkitStrings.fwid = this.cast("fwid")
  @scala.inline
  def half: typings.pdfkit.pdfkitStrings.half = this.cast("half")
  @scala.inline
  def haln: typings.pdfkit.pdfkitStrings.haln = this.cast("haln")
  @scala.inline
  def halt: typings.pdfkit.pdfkitStrings.halt = this.cast("halt")
  @scala.inline
  def hist: typings.pdfkit.pdfkitStrings.hist = this.cast("hist")
  @scala.inline
  def hkna: typings.pdfkit.pdfkitStrings.hkna = this.cast("hkna")
  @scala.inline
  def hlig: typings.pdfkit.pdfkitStrings.hlig = this.cast("hlig")
  @scala.inline
  def hngl: typings.pdfkit.pdfkitStrings.hngl = this.cast("hngl")
  @scala.inline
  def hojo: typings.pdfkit.pdfkitStrings.hojo = this.cast("hojo")
  @scala.inline
  def hwid: typings.pdfkit.pdfkitStrings.hwid = this.cast("hwid")
  @scala.inline
  def init: typings.pdfkit.pdfkitStrings.init = this.cast("init")
  @scala.inline
  def isol: typings.pdfkit.pdfkitStrings.isol = this.cast("isol")
  @scala.inline
  def ital: typings.pdfkit.pdfkitStrings.ital = this.cast("ital")
  @scala.inline
  def jalt: typings.pdfkit.pdfkitStrings.jalt = this.cast("jalt")
  @scala.inline
  def jp04: typings.pdfkit.pdfkitStrings.jp04 = this.cast("jp04")
  @scala.inline
  def jp78: typings.pdfkit.pdfkitStrings.jp78 = this.cast("jp78")
  @scala.inline
  def jp83: typings.pdfkit.pdfkitStrings.jp83 = this.cast("jp83")
  @scala.inline
  def jp90: typings.pdfkit.pdfkitStrings.jp90 = this.cast("jp90")
  @scala.inline
  def kern: typings.pdfkit.pdfkitStrings.kern = this.cast("kern")
  @scala.inline
  def lfbd: typings.pdfkit.pdfkitStrings.lfbd = this.cast("lfbd")
  @scala.inline
  def liga: typings.pdfkit.pdfkitStrings.liga = this.cast("liga")
  @scala.inline
  def ljmo: typings.pdfkit.pdfkitStrings.ljmo = this.cast("ljmo")
  @scala.inline
  def lnum: typings.pdfkit.pdfkitStrings.lnum = this.cast("lnum")
  @scala.inline
  def locl: typings.pdfkit.pdfkitStrings.locl = this.cast("locl")
  @scala.inline
  def ltra: typings.pdfkit.pdfkitStrings.ltra = this.cast("ltra")
  @scala.inline
  def ltrm: typings.pdfkit.pdfkitStrings.ltrm = this.cast("ltrm")
  @scala.inline
  def mark: typings.pdfkit.pdfkitStrings.mark = this.cast("mark")
  @scala.inline
  def med2: typings.pdfkit.pdfkitStrings.med2 = this.cast("med2")
  @scala.inline
  def medi: typings.pdfkit.pdfkitStrings.medi = this.cast("medi")
  @scala.inline
  def mgrk: typings.pdfkit.pdfkitStrings.mgrk = this.cast("mgrk")
  @scala.inline
  def mkmk: typings.pdfkit.pdfkitStrings.mkmk = this.cast("mkmk")
  @scala.inline
  def mset: typings.pdfkit.pdfkitStrings.mset = this.cast("mset")
  @scala.inline
  def nalt: typings.pdfkit.pdfkitStrings.nalt = this.cast("nalt")
  @scala.inline
  def nlck: typings.pdfkit.pdfkitStrings.nlck = this.cast("nlck")
  @scala.inline
  def nukt: typings.pdfkit.pdfkitStrings.nukt = this.cast("nukt")
  @scala.inline
  def numr: typings.pdfkit.pdfkitStrings.numr = this.cast("numr")
  @scala.inline
  def onum: typings.pdfkit.pdfkitStrings.onum = this.cast("onum")
  @scala.inline
  def opbd: typings.pdfkit.pdfkitStrings.opbd = this.cast("opbd")
  @scala.inline
  def ordn: typings.pdfkit.pdfkitStrings.ordn = this.cast("ordn")
  @scala.inline
  def ornm: typings.pdfkit.pdfkitStrings.ornm = this.cast("ornm")
  @scala.inline
  def palt: typings.pdfkit.pdfkitStrings.palt = this.cast("palt")
  @scala.inline
  def pcap: typings.pdfkit.pdfkitStrings.pcap = this.cast("pcap")
  @scala.inline
  def pkna: typings.pdfkit.pdfkitStrings.pkna = this.cast("pkna")
  @scala.inline
  def pnum: typings.pdfkit.pdfkitStrings.pnum = this.cast("pnum")
  @scala.inline
  def pref: typings.pdfkit.pdfkitStrings.pref = this.cast("pref")
  @scala.inline
  def pres: typings.pdfkit.pdfkitStrings.pres = this.cast("pres")
  @scala.inline
  def pstf: typings.pdfkit.pdfkitStrings.pstf = this.cast("pstf")
  @scala.inline
  def psts: typings.pdfkit.pdfkitStrings.psts = this.cast("psts")
  @scala.inline
  def pwid: typings.pdfkit.pdfkitStrings.pwid = this.cast("pwid")
  @scala.inline
  def qwid: typings.pdfkit.pdfkitStrings.qwid = this.cast("qwid")
  @scala.inline
  def rand: typings.pdfkit.pdfkitStrings.rand = this.cast("rand")
  @scala.inline
  def rclt: typings.pdfkit.pdfkitStrings.rclt = this.cast("rclt")
  @scala.inline
  def rkrf: typings.pdfkit.pdfkitStrings.rkrf = this.cast("rkrf")
  @scala.inline
  def rlig: typings.pdfkit.pdfkitStrings.rlig = this.cast("rlig")
  @scala.inline
  def rphf: typings.pdfkit.pdfkitStrings.rphf = this.cast("rphf")
  @scala.inline
  def rtbd: typings.pdfkit.pdfkitStrings.rtbd = this.cast("rtbd")
  @scala.inline
  def rtla: typings.pdfkit.pdfkitStrings.rtla = this.cast("rtla")
  @scala.inline
  def rtlm: typings.pdfkit.pdfkitStrings.rtlm = this.cast("rtlm")
  @scala.inline
  def ruby: typings.pdfkit.pdfkitStrings.ruby = this.cast("ruby")
  @scala.inline
  def rvrn: typings.pdfkit.pdfkitStrings.rvrn = this.cast("rvrn")
  @scala.inline
  def salt: typings.pdfkit.pdfkitStrings.salt = this.cast("salt")
  @scala.inline
  def sinf: typings.pdfkit.pdfkitStrings.sinf = this.cast("sinf")
  @scala.inline
  def size: typings.pdfkit.pdfkitStrings.size = this.cast("size")
  @scala.inline
  def smcp: typings.pdfkit.pdfkitStrings.smcp = this.cast("smcp")
  @scala.inline
  def smpl: typings.pdfkit.pdfkitStrings.smpl = this.cast("smpl")
  @scala.inline
  def ss01: typings.pdfkit.pdfkitStrings.ss01 = this.cast("ss01")
  @scala.inline
  def ss02: typings.pdfkit.pdfkitStrings.ss02 = this.cast("ss02")
  @scala.inline
  def ss03: typings.pdfkit.pdfkitStrings.ss03 = this.cast("ss03")
  @scala.inline
  def ss04: typings.pdfkit.pdfkitStrings.ss04 = this.cast("ss04")
  @scala.inline
  def ss05: typings.pdfkit.pdfkitStrings.ss05 = this.cast("ss05")
  @scala.inline
  def ss06: typings.pdfkit.pdfkitStrings.ss06 = this.cast("ss06")
  @scala.inline
  def ss07: typings.pdfkit.pdfkitStrings.ss07 = this.cast("ss07")
  @scala.inline
  def ss08: typings.pdfkit.pdfkitStrings.ss08 = this.cast("ss08")
  @scala.inline
  def ss09: typings.pdfkit.pdfkitStrings.ss09 = this.cast("ss09")
  @scala.inline
  def ss10: typings.pdfkit.pdfkitStrings.ss10 = this.cast("ss10")
  @scala.inline
  def ss11: typings.pdfkit.pdfkitStrings.ss11 = this.cast("ss11")
  @scala.inline
  def ss12: typings.pdfkit.pdfkitStrings.ss12 = this.cast("ss12")
  @scala.inline
  def ss13: typings.pdfkit.pdfkitStrings.ss13 = this.cast("ss13")
  @scala.inline
  def ss14: typings.pdfkit.pdfkitStrings.ss14 = this.cast("ss14")
  @scala.inline
  def ss15: typings.pdfkit.pdfkitStrings.ss15 = this.cast("ss15")
  @scala.inline
  def ss16: typings.pdfkit.pdfkitStrings.ss16 = this.cast("ss16")
  @scala.inline
  def ss17: typings.pdfkit.pdfkitStrings.ss17 = this.cast("ss17")
  @scala.inline
  def ss18: typings.pdfkit.pdfkitStrings.ss18 = this.cast("ss18")
  @scala.inline
  def ss19: typings.pdfkit.pdfkitStrings.ss19 = this.cast("ss19")
  @scala.inline
  def ss20: typings.pdfkit.pdfkitStrings.ss20 = this.cast("ss20")
  @scala.inline
  def ssty: typings.pdfkit.pdfkitStrings.ssty = this.cast("ssty")
  @scala.inline
  def stch: typings.pdfkit.pdfkitStrings.stch = this.cast("stch")
  @scala.inline
  def subs: typings.pdfkit.pdfkitStrings.subs = this.cast("subs")
  @scala.inline
  def sups: typings.pdfkit.pdfkitStrings.sups = this.cast("sups")
  @scala.inline
  def swsh: typings.pdfkit.pdfkitStrings.swsh = this.cast("swsh")
  @scala.inline
  def titl: typings.pdfkit.pdfkitStrings.titl = this.cast("titl")
  @scala.inline
  def tjmo: typings.pdfkit.pdfkitStrings.tjmo = this.cast("tjmo")
  @scala.inline
  def tnam: typings.pdfkit.pdfkitStrings.tnam = this.cast("tnam")
  @scala.inline
  def tnum: typings.pdfkit.pdfkitStrings.tnum = this.cast("tnum")
  @scala.inline
  def trad: typings.pdfkit.pdfkitStrings.trad = this.cast("trad")
  @scala.inline
  def twid: typings.pdfkit.pdfkitStrings.twid = this.cast("twid")
  @scala.inline
  def unic: typings.pdfkit.pdfkitStrings.unic = this.cast("unic")
  @scala.inline
  def valt: typings.pdfkit.pdfkitStrings.valt = this.cast("valt")
  @scala.inline
  def vatu: typings.pdfkit.pdfkitStrings.vatu = this.cast("vatu")
  @scala.inline
  def vert: typings.pdfkit.pdfkitStrings.vert = this.cast("vert")
  @scala.inline
  def vhal: typings.pdfkit.pdfkitStrings.vhal = this.cast("vhal")
  @scala.inline
  def vjmo: typings.pdfkit.pdfkitStrings.vjmo = this.cast("vjmo")
  @scala.inline
  def vkna: typings.pdfkit.pdfkitStrings.vkna = this.cast("vkna")
  @scala.inline
  def vkrn: typings.pdfkit.pdfkitStrings.vkrn = this.cast("vkrn")
  @scala.inline
  def vpal: typings.pdfkit.pdfkitStrings.vpal = this.cast("vpal")
  @scala.inline
  def vrt2: typings.pdfkit.pdfkitStrings.vrt2 = this.cast("vrt2")
  @scala.inline
  def vrtr: typings.pdfkit.pdfkitStrings.vrtr = this.cast("vrtr")
  @scala.inline
  def zero: typings.pdfkit.pdfkitStrings.zero = this.cast("zero")
}

