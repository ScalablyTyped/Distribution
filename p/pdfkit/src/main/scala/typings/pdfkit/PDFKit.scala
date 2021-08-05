package typings.pdfkit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.pdfkit.PDFKit.Mixins.PDFAnnotation
import typings.pdfkit.PDFKit.Mixins.PDFColor
import typings.pdfkit.PDFKit.Mixins.PDFFont
import typings.pdfkit.PDFKit.Mixins.PDFImage
import typings.pdfkit.PDFKit.Mixins.PDFText
import typings.pdfkit.PDFKit.Mixins.PDFVector
import typings.pdfkit.anon.Annots
import typings.pdfkit.anon.Bottom
import typings.pdfkit.anon.Count
import typings.pdfkit.anon.Origin
import typings.pdfkit.pdfkitStrings.`1Dot3`
import typings.pdfkit.pdfkitStrings.`1Dot4`
import typings.pdfkit.pdfkitStrings.`1Dot5`
import typings.pdfkit.pdfkitStrings.`1Dot6`
import typings.pdfkit.pdfkitStrings.`1Dot7`
import typings.pdfkit.pdfkitStrings.`1Dot7ext3`
import typings.pdfkit.pdfkitStrings.`svg-central`
import typings.pdfkit.pdfkitStrings.`svg-middle`
import typings.pdfkit.pdfkitStrings.alphabetic
import typings.pdfkit.pdfkitStrings.bottom
import typings.pdfkit.pdfkitStrings.center
import typings.pdfkit.pdfkitStrings.hanging
import typings.pdfkit.pdfkitStrings.highResolution
import typings.pdfkit.pdfkitStrings.ideographic
import typings.pdfkit.pdfkitStrings.justify
import typings.pdfkit.pdfkitStrings.landscape
import typings.pdfkit.pdfkitStrings.left
import typings.pdfkit.pdfkitStrings.lowResolution
import typings.pdfkit.pdfkitStrings.mathematical
import typings.pdfkit.pdfkitStrings.middle
import typings.pdfkit.pdfkitStrings.portrait
import typings.pdfkit.pdfkitStrings.right
import typings.pdfkit.pdfkitStrings.top
import typings.std.ArrayBuffer
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PDFKit {
  
  trait DocumentInfo extends StObject {
    
    var Author: js.UndefOr[String] = js.undefined
    
    var CreationDate: js.UndefOr[Date] = js.undefined
    
    var Creator: js.UndefOr[String] = js.undefined
    
    var Keywords: js.UndefOr[String] = js.undefined
    
    var ModDate: js.UndefOr[Date] = js.undefined
    
    var Producer: js.UndefOr[String] = js.undefined
    
    var Title: js.UndefOr[String] = js.undefined
  }
  object DocumentInfo {
    
    inline def apply(): DocumentInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentInfo]
    }
    
    extension [Self <: DocumentInfo](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
      
      inline def setCreationDate(value: Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorUndefined: Self = StObject.set(x, "Creator", js.undefined)
      
      inline def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
      
      inline def setModDate(value: Date): Self = StObject.set(x, "ModDate", value.asInstanceOf[js.Any])
      
      inline def setModDateUndefined: Self = StObject.set(x, "ModDate", js.undefined)
      
      inline def setProducer(value: String): Self = StObject.set(x, "Producer", value.asInstanceOf[js.Any])
      
      inline def setProducerUndefined: Self = StObject.set(x, "Producer", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait DocumentPermissions extends StObject {
    
    var annotating: js.UndefOr[Boolean] = js.undefined
    
    var contentAccessibility: js.UndefOr[Boolean] = js.undefined
    
    var copying: js.UndefOr[Boolean] = js.undefined
    
    var documentAssembly: js.UndefOr[Boolean] = js.undefined
    
    var fillingForms: js.UndefOr[Boolean] = js.undefined
    
    var modifying: js.UndefOr[Boolean] = js.undefined
    
    var printing: js.UndefOr[lowResolution | highResolution] = js.undefined
  }
  object DocumentPermissions {
    
    inline def apply(): DocumentPermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPermissions]
    }
    
    extension [Self <: DocumentPermissions](x: Self) {
      
      inline def setAnnotating(value: Boolean): Self = StObject.set(x, "annotating", value.asInstanceOf[js.Any])
      
      inline def setAnnotatingUndefined: Self = StObject.set(x, "annotating", js.undefined)
      
      inline def setContentAccessibility(value: Boolean): Self = StObject.set(x, "contentAccessibility", value.asInstanceOf[js.Any])
      
      inline def setContentAccessibilityUndefined: Self = StObject.set(x, "contentAccessibility", js.undefined)
      
      inline def setCopying(value: Boolean): Self = StObject.set(x, "copying", value.asInstanceOf[js.Any])
      
      inline def setCopyingUndefined: Self = StObject.set(x, "copying", js.undefined)
      
      inline def setDocumentAssembly(value: Boolean): Self = StObject.set(x, "documentAssembly", value.asInstanceOf[js.Any])
      
      inline def setDocumentAssemblyUndefined: Self = StObject.set(x, "documentAssembly", js.undefined)
      
      inline def setFillingForms(value: Boolean): Self = StObject.set(x, "fillingForms", value.asInstanceOf[js.Any])
      
      inline def setFillingFormsUndefined: Self = StObject.set(x, "fillingForms", js.undefined)
      
      inline def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
      
      inline def setModifyingUndefined: Self = StObject.set(x, "modifying", js.undefined)
      
      inline def setPrinting(value: lowResolution | highResolution): Self = StObject.set(x, "printing", value.asInstanceOf[js.Any])
      
      inline def setPrintingUndefined: Self = StObject.set(x, "printing", js.undefined)
    }
  }
  
  object Mixins {
    
    trait AnnotationOption extends StObject {
      
      var A: js.UndefOr[js.Any] = js.undefined
      
      var B: js.UndefOr[js.Any] = js.undefined
      
      var Border: js.UndefOr[js.Array[Double]] = js.undefined
      
      var C: js.UndefOr[js.Any] = js.undefined
      
      var Contents: js.UndefOr[String] = js.undefined
      
      var DA: js.UndefOr[String] = js.undefined
      
      var L: js.UndefOr[js.Any] = js.undefined
      
      var Name: js.UndefOr[String] = js.undefined
      
      var QuadPoints: js.UndefOr[js.Array[Double]] = js.undefined
      
      var Rect: js.UndefOr[js.Any] = js.undefined
      
      var SubType: js.UndefOr[String] = js.undefined
      
      var Type: js.UndefOr[String] = js.undefined
      
      var color: js.UndefOr[String] = js.undefined
    }
    object AnnotationOption {
      
      inline def apply(): AnnotationOption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnnotationOption]
      }
      
      extension [Self <: AnnotationOption](x: Self) {
        
        inline def setA(value: js.Any): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
        
        inline def setAUndefined: Self = StObject.set(x, "A", js.undefined)
        
        inline def setB(value: js.Any): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
        
        inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
        
        inline def setBorder(value: js.Array[Double]): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
        
        inline def setBorderUndefined: Self = StObject.set(x, "Border", js.undefined)
        
        inline def setBorderVarargs(value: Double*): Self = StObject.set(x, "Border", js.Array(value :_*))
        
        inline def setC(value: js.Any): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
        
        inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setContents(value: String): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
        
        inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
        
        inline def setDA(value: String): Self = StObject.set(x, "DA", value.asInstanceOf[js.Any])
        
        inline def setDAUndefined: Self = StObject.set(x, "DA", js.undefined)
        
        inline def setL(value: js.Any): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
        
        inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
        
        inline def setQuadPoints(value: js.Array[Double]): Self = StObject.set(x, "QuadPoints", value.asInstanceOf[js.Any])
        
        inline def setQuadPointsUndefined: Self = StObject.set(x, "QuadPoints", js.undefined)
        
        inline def setQuadPointsVarargs(value: Double*): Self = StObject.set(x, "QuadPoints", js.Array(value :_*))
        
        inline def setRect(value: js.Any): Self = StObject.set(x, "Rect", value.asInstanceOf[js.Any])
        
        inline def setRectUndefined: Self = StObject.set(x, "Rect", js.undefined)
        
        inline def setSubType(value: String): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
        
        inline def setSubTypeUndefined: Self = StObject.set(x, "SubType", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
      }
    }
    
    // The color forms accepted by PDFKit:
    //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
    type ColorValue = String | PDFGradient | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    
    trait ImageOption extends StObject {
      
      var align: js.UndefOr[center | right] = js.undefined
      
      var cover: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      var destination: js.UndefOr[String] = js.undefined
      
      /** Two elements array specifying dimensions(w,h)  */
      var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      var goTo: js.UndefOr[AnnotationOption] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var link: js.UndefOr[AnnotationOption] = js.undefined
      
      /** Scale percentage */
      var scale: js.UndefOr[Double] = js.undefined
      
      var valign: js.UndefOr[center | bottom] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object ImageOption {
      
      inline def apply(): ImageOption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageOption]
      }
      
      extension [Self <: ImageOption](x: Self) {
        
        inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setCover(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
        
        inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
        
        inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
        
        inline def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
        
        inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
        
        inline def setGoTo(value: AnnotationOption): Self = StObject.set(x, "goTo", value.asInstanceOf[js.Any])
        
        inline def setGoToUndefined: Self = StObject.set(x, "goTo", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setLink(value: AnnotationOption): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        inline def setValign(value: center | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
        
        inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
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
    trait OpenTypeFeatures extends StObject
    object OpenTypeFeatures {
      
      inline def aalt: typings.pdfkit.pdfkitStrings.aalt = "aalt".asInstanceOf[typings.pdfkit.pdfkitStrings.aalt]
      
      inline def abvf: typings.pdfkit.pdfkitStrings.abvf = "abvf".asInstanceOf[typings.pdfkit.pdfkitStrings.abvf]
      
      inline def abvm: typings.pdfkit.pdfkitStrings.abvm = "abvm".asInstanceOf[typings.pdfkit.pdfkitStrings.abvm]
      
      inline def abvs: typings.pdfkit.pdfkitStrings.abvs = "abvs".asInstanceOf[typings.pdfkit.pdfkitStrings.abvs]
      
      inline def afrc: typings.pdfkit.pdfkitStrings.afrc = "afrc".asInstanceOf[typings.pdfkit.pdfkitStrings.afrc]
      
      inline def akhn: typings.pdfkit.pdfkitStrings.akhn = "akhn".asInstanceOf[typings.pdfkit.pdfkitStrings.akhn]
      
      inline def blwf: typings.pdfkit.pdfkitStrings.blwf = "blwf".asInstanceOf[typings.pdfkit.pdfkitStrings.blwf]
      
      inline def blwm: typings.pdfkit.pdfkitStrings.blwm = "blwm".asInstanceOf[typings.pdfkit.pdfkitStrings.blwm]
      
      inline def blws: typings.pdfkit.pdfkitStrings.blws = "blws".asInstanceOf[typings.pdfkit.pdfkitStrings.blws]
      
      inline def c2pc: typings.pdfkit.pdfkitStrings.c2pc = "c2pc".asInstanceOf[typings.pdfkit.pdfkitStrings.c2pc]
      
      inline def c2sc: typings.pdfkit.pdfkitStrings.c2sc = "c2sc".asInstanceOf[typings.pdfkit.pdfkitStrings.c2sc]
      
      inline def calt: typings.pdfkit.pdfkitStrings.calt = "calt".asInstanceOf[typings.pdfkit.pdfkitStrings.calt]
      
      inline def `case`: typings.pdfkit.pdfkitStrings.`case` = "case".asInstanceOf[typings.pdfkit.pdfkitStrings.`case`]
      
      inline def ccmp: typings.pdfkit.pdfkitStrings.ccmp = "ccmp".asInstanceOf[typings.pdfkit.pdfkitStrings.ccmp]
      
      inline def cfar: typings.pdfkit.pdfkitStrings.cfar = "cfar".asInstanceOf[typings.pdfkit.pdfkitStrings.cfar]
      
      inline def cjct: typings.pdfkit.pdfkitStrings.cjct = "cjct".asInstanceOf[typings.pdfkit.pdfkitStrings.cjct]
      
      inline def clig: typings.pdfkit.pdfkitStrings.clig = "clig".asInstanceOf[typings.pdfkit.pdfkitStrings.clig]
      
      inline def cpct: typings.pdfkit.pdfkitStrings.cpct = "cpct".asInstanceOf[typings.pdfkit.pdfkitStrings.cpct]
      
      inline def cpsp: typings.pdfkit.pdfkitStrings.cpsp = "cpsp".asInstanceOf[typings.pdfkit.pdfkitStrings.cpsp]
      
      inline def cswh: typings.pdfkit.pdfkitStrings.cswh = "cswh".asInstanceOf[typings.pdfkit.pdfkitStrings.cswh]
      
      inline def curs: typings.pdfkit.pdfkitStrings.curs = "curs".asInstanceOf[typings.pdfkit.pdfkitStrings.curs]
      
      inline def cv01: typings.pdfkit.pdfkitStrings.cv01 = "cv01".asInstanceOf[typings.pdfkit.pdfkitStrings.cv01]
      
      inline def cv02: typings.pdfkit.pdfkitStrings.cv02 = "cv02".asInstanceOf[typings.pdfkit.pdfkitStrings.cv02]
      
      inline def cv03: typings.pdfkit.pdfkitStrings.cv03 = "cv03".asInstanceOf[typings.pdfkit.pdfkitStrings.cv03]
      
      inline def cv04: typings.pdfkit.pdfkitStrings.cv04 = "cv04".asInstanceOf[typings.pdfkit.pdfkitStrings.cv04]
      
      inline def cv05: typings.pdfkit.pdfkitStrings.cv05 = "cv05".asInstanceOf[typings.pdfkit.pdfkitStrings.cv05]
      
      inline def cv06: typings.pdfkit.pdfkitStrings.cv06 = "cv06".asInstanceOf[typings.pdfkit.pdfkitStrings.cv06]
      
      inline def cv07: typings.pdfkit.pdfkitStrings.cv07 = "cv07".asInstanceOf[typings.pdfkit.pdfkitStrings.cv07]
      
      inline def cv08: typings.pdfkit.pdfkitStrings.cv08 = "cv08".asInstanceOf[typings.pdfkit.pdfkitStrings.cv08]
      
      inline def cv09: typings.pdfkit.pdfkitStrings.cv09 = "cv09".asInstanceOf[typings.pdfkit.pdfkitStrings.cv09]
      
      inline def cv10: typings.pdfkit.pdfkitStrings.cv10 = "cv10".asInstanceOf[typings.pdfkit.pdfkitStrings.cv10]
      
      inline def cv11: typings.pdfkit.pdfkitStrings.cv11 = "cv11".asInstanceOf[typings.pdfkit.pdfkitStrings.cv11]
      
      inline def cv12: typings.pdfkit.pdfkitStrings.cv12 = "cv12".asInstanceOf[typings.pdfkit.pdfkitStrings.cv12]
      
      inline def cv13: typings.pdfkit.pdfkitStrings.cv13 = "cv13".asInstanceOf[typings.pdfkit.pdfkitStrings.cv13]
      
      inline def cv14: typings.pdfkit.pdfkitStrings.cv14 = "cv14".asInstanceOf[typings.pdfkit.pdfkitStrings.cv14]
      
      inline def cv15: typings.pdfkit.pdfkitStrings.cv15 = "cv15".asInstanceOf[typings.pdfkit.pdfkitStrings.cv15]
      
      inline def cv16: typings.pdfkit.pdfkitStrings.cv16 = "cv16".asInstanceOf[typings.pdfkit.pdfkitStrings.cv16]
      
      inline def cv17: typings.pdfkit.pdfkitStrings.cv17 = "cv17".asInstanceOf[typings.pdfkit.pdfkitStrings.cv17]
      
      inline def cv18: typings.pdfkit.pdfkitStrings.cv18 = "cv18".asInstanceOf[typings.pdfkit.pdfkitStrings.cv18]
      
      inline def cv19: typings.pdfkit.pdfkitStrings.cv19 = "cv19".asInstanceOf[typings.pdfkit.pdfkitStrings.cv19]
      
      inline def cv20: typings.pdfkit.pdfkitStrings.cv20 = "cv20".asInstanceOf[typings.pdfkit.pdfkitStrings.cv20]
      
      inline def cv21: typings.pdfkit.pdfkitStrings.cv21 = "cv21".asInstanceOf[typings.pdfkit.pdfkitStrings.cv21]
      
      inline def cv22: typings.pdfkit.pdfkitStrings.cv22 = "cv22".asInstanceOf[typings.pdfkit.pdfkitStrings.cv22]
      
      inline def cv23: typings.pdfkit.pdfkitStrings.cv23 = "cv23".asInstanceOf[typings.pdfkit.pdfkitStrings.cv23]
      
      inline def cv24: typings.pdfkit.pdfkitStrings.cv24 = "cv24".asInstanceOf[typings.pdfkit.pdfkitStrings.cv24]
      
      inline def cv25: typings.pdfkit.pdfkitStrings.cv25 = "cv25".asInstanceOf[typings.pdfkit.pdfkitStrings.cv25]
      
      inline def cv26: typings.pdfkit.pdfkitStrings.cv26 = "cv26".asInstanceOf[typings.pdfkit.pdfkitStrings.cv26]
      
      inline def cv27: typings.pdfkit.pdfkitStrings.cv27 = "cv27".asInstanceOf[typings.pdfkit.pdfkitStrings.cv27]
      
      inline def cv28: typings.pdfkit.pdfkitStrings.cv28 = "cv28".asInstanceOf[typings.pdfkit.pdfkitStrings.cv28]
      
      inline def cv29: typings.pdfkit.pdfkitStrings.cv29 = "cv29".asInstanceOf[typings.pdfkit.pdfkitStrings.cv29]
      
      inline def cv30: typings.pdfkit.pdfkitStrings.cv30 = "cv30".asInstanceOf[typings.pdfkit.pdfkitStrings.cv30]
      
      inline def cv31: typings.pdfkit.pdfkitStrings.cv31 = "cv31".asInstanceOf[typings.pdfkit.pdfkitStrings.cv31]
      
      inline def cv32: typings.pdfkit.pdfkitStrings.cv32 = "cv32".asInstanceOf[typings.pdfkit.pdfkitStrings.cv32]
      
      inline def cv33: typings.pdfkit.pdfkitStrings.cv33 = "cv33".asInstanceOf[typings.pdfkit.pdfkitStrings.cv33]
      
      inline def cv34: typings.pdfkit.pdfkitStrings.cv34 = "cv34".asInstanceOf[typings.pdfkit.pdfkitStrings.cv34]
      
      inline def cv35: typings.pdfkit.pdfkitStrings.cv35 = "cv35".asInstanceOf[typings.pdfkit.pdfkitStrings.cv35]
      
      inline def cv36: typings.pdfkit.pdfkitStrings.cv36 = "cv36".asInstanceOf[typings.pdfkit.pdfkitStrings.cv36]
      
      inline def cv37: typings.pdfkit.pdfkitStrings.cv37 = "cv37".asInstanceOf[typings.pdfkit.pdfkitStrings.cv37]
      
      inline def cv38: typings.pdfkit.pdfkitStrings.cv38 = "cv38".asInstanceOf[typings.pdfkit.pdfkitStrings.cv38]
      
      inline def cv39: typings.pdfkit.pdfkitStrings.cv39 = "cv39".asInstanceOf[typings.pdfkit.pdfkitStrings.cv39]
      
      inline def cv40: typings.pdfkit.pdfkitStrings.cv40 = "cv40".asInstanceOf[typings.pdfkit.pdfkitStrings.cv40]
      
      inline def cv41: typings.pdfkit.pdfkitStrings.cv41 = "cv41".asInstanceOf[typings.pdfkit.pdfkitStrings.cv41]
      
      inline def cv42: typings.pdfkit.pdfkitStrings.cv42 = "cv42".asInstanceOf[typings.pdfkit.pdfkitStrings.cv42]
      
      inline def cv43: typings.pdfkit.pdfkitStrings.cv43 = "cv43".asInstanceOf[typings.pdfkit.pdfkitStrings.cv43]
      
      inline def cv44: typings.pdfkit.pdfkitStrings.cv44 = "cv44".asInstanceOf[typings.pdfkit.pdfkitStrings.cv44]
      
      inline def cv45: typings.pdfkit.pdfkitStrings.cv45 = "cv45".asInstanceOf[typings.pdfkit.pdfkitStrings.cv45]
      
      inline def cv46: typings.pdfkit.pdfkitStrings.cv46 = "cv46".asInstanceOf[typings.pdfkit.pdfkitStrings.cv46]
      
      inline def cv47: typings.pdfkit.pdfkitStrings.cv47 = "cv47".asInstanceOf[typings.pdfkit.pdfkitStrings.cv47]
      
      inline def cv48: typings.pdfkit.pdfkitStrings.cv48 = "cv48".asInstanceOf[typings.pdfkit.pdfkitStrings.cv48]
      
      inline def cv49: typings.pdfkit.pdfkitStrings.cv49 = "cv49".asInstanceOf[typings.pdfkit.pdfkitStrings.cv49]
      
      inline def cv50: typings.pdfkit.pdfkitStrings.cv50 = "cv50".asInstanceOf[typings.pdfkit.pdfkitStrings.cv50]
      
      inline def cv51: typings.pdfkit.pdfkitStrings.cv51 = "cv51".asInstanceOf[typings.pdfkit.pdfkitStrings.cv51]
      
      inline def cv52: typings.pdfkit.pdfkitStrings.cv52 = "cv52".asInstanceOf[typings.pdfkit.pdfkitStrings.cv52]
      
      inline def cv53: typings.pdfkit.pdfkitStrings.cv53 = "cv53".asInstanceOf[typings.pdfkit.pdfkitStrings.cv53]
      
      inline def cv54: typings.pdfkit.pdfkitStrings.cv54 = "cv54".asInstanceOf[typings.pdfkit.pdfkitStrings.cv54]
      
      inline def cv55: typings.pdfkit.pdfkitStrings.cv55 = "cv55".asInstanceOf[typings.pdfkit.pdfkitStrings.cv55]
      
      inline def cv56: typings.pdfkit.pdfkitStrings.cv56 = "cv56".asInstanceOf[typings.pdfkit.pdfkitStrings.cv56]
      
      inline def cv57: typings.pdfkit.pdfkitStrings.cv57 = "cv57".asInstanceOf[typings.pdfkit.pdfkitStrings.cv57]
      
      inline def cv58: typings.pdfkit.pdfkitStrings.cv58 = "cv58".asInstanceOf[typings.pdfkit.pdfkitStrings.cv58]
      
      inline def cv59: typings.pdfkit.pdfkitStrings.cv59 = "cv59".asInstanceOf[typings.pdfkit.pdfkitStrings.cv59]
      
      inline def cv60: typings.pdfkit.pdfkitStrings.cv60 = "cv60".asInstanceOf[typings.pdfkit.pdfkitStrings.cv60]
      
      inline def cv61: typings.pdfkit.pdfkitStrings.cv61 = "cv61".asInstanceOf[typings.pdfkit.pdfkitStrings.cv61]
      
      inline def cv62: typings.pdfkit.pdfkitStrings.cv62 = "cv62".asInstanceOf[typings.pdfkit.pdfkitStrings.cv62]
      
      inline def cv63: typings.pdfkit.pdfkitStrings.cv63 = "cv63".asInstanceOf[typings.pdfkit.pdfkitStrings.cv63]
      
      inline def cv64: typings.pdfkit.pdfkitStrings.cv64 = "cv64".asInstanceOf[typings.pdfkit.pdfkitStrings.cv64]
      
      inline def cv65: typings.pdfkit.pdfkitStrings.cv65 = "cv65".asInstanceOf[typings.pdfkit.pdfkitStrings.cv65]
      
      inline def cv66: typings.pdfkit.pdfkitStrings.cv66 = "cv66".asInstanceOf[typings.pdfkit.pdfkitStrings.cv66]
      
      inline def cv67: typings.pdfkit.pdfkitStrings.cv67 = "cv67".asInstanceOf[typings.pdfkit.pdfkitStrings.cv67]
      
      inline def cv68: typings.pdfkit.pdfkitStrings.cv68 = "cv68".asInstanceOf[typings.pdfkit.pdfkitStrings.cv68]
      
      inline def cv69: typings.pdfkit.pdfkitStrings.cv69 = "cv69".asInstanceOf[typings.pdfkit.pdfkitStrings.cv69]
      
      inline def cv70: typings.pdfkit.pdfkitStrings.cv70 = "cv70".asInstanceOf[typings.pdfkit.pdfkitStrings.cv70]
      
      inline def cv71: typings.pdfkit.pdfkitStrings.cv71 = "cv71".asInstanceOf[typings.pdfkit.pdfkitStrings.cv71]
      
      inline def cv72: typings.pdfkit.pdfkitStrings.cv72 = "cv72".asInstanceOf[typings.pdfkit.pdfkitStrings.cv72]
      
      inline def cv73: typings.pdfkit.pdfkitStrings.cv73 = "cv73".asInstanceOf[typings.pdfkit.pdfkitStrings.cv73]
      
      inline def cv74: typings.pdfkit.pdfkitStrings.cv74 = "cv74".asInstanceOf[typings.pdfkit.pdfkitStrings.cv74]
      
      inline def cv75: typings.pdfkit.pdfkitStrings.cv75 = "cv75".asInstanceOf[typings.pdfkit.pdfkitStrings.cv75]
      
      inline def cv76: typings.pdfkit.pdfkitStrings.cv76 = "cv76".asInstanceOf[typings.pdfkit.pdfkitStrings.cv76]
      
      inline def cv77: typings.pdfkit.pdfkitStrings.cv77 = "cv77".asInstanceOf[typings.pdfkit.pdfkitStrings.cv77]
      
      inline def cv78: typings.pdfkit.pdfkitStrings.cv78 = "cv78".asInstanceOf[typings.pdfkit.pdfkitStrings.cv78]
      
      inline def cv79: typings.pdfkit.pdfkitStrings.cv79 = "cv79".asInstanceOf[typings.pdfkit.pdfkitStrings.cv79]
      
      inline def cv80: typings.pdfkit.pdfkitStrings.cv80 = "cv80".asInstanceOf[typings.pdfkit.pdfkitStrings.cv80]
      
      inline def cv81: typings.pdfkit.pdfkitStrings.cv81 = "cv81".asInstanceOf[typings.pdfkit.pdfkitStrings.cv81]
      
      inline def cv82: typings.pdfkit.pdfkitStrings.cv82 = "cv82".asInstanceOf[typings.pdfkit.pdfkitStrings.cv82]
      
      inline def cv83: typings.pdfkit.pdfkitStrings.cv83 = "cv83".asInstanceOf[typings.pdfkit.pdfkitStrings.cv83]
      
      inline def cv84: typings.pdfkit.pdfkitStrings.cv84 = "cv84".asInstanceOf[typings.pdfkit.pdfkitStrings.cv84]
      
      inline def cv85: typings.pdfkit.pdfkitStrings.cv85 = "cv85".asInstanceOf[typings.pdfkit.pdfkitStrings.cv85]
      
      inline def cv86: typings.pdfkit.pdfkitStrings.cv86 = "cv86".asInstanceOf[typings.pdfkit.pdfkitStrings.cv86]
      
      inline def cv87: typings.pdfkit.pdfkitStrings.cv87 = "cv87".asInstanceOf[typings.pdfkit.pdfkitStrings.cv87]
      
      inline def cv88: typings.pdfkit.pdfkitStrings.cv88 = "cv88".asInstanceOf[typings.pdfkit.pdfkitStrings.cv88]
      
      inline def cv89: typings.pdfkit.pdfkitStrings.cv89 = "cv89".asInstanceOf[typings.pdfkit.pdfkitStrings.cv89]
      
      inline def cv90: typings.pdfkit.pdfkitStrings.cv90 = "cv90".asInstanceOf[typings.pdfkit.pdfkitStrings.cv90]
      
      inline def cv91: typings.pdfkit.pdfkitStrings.cv91 = "cv91".asInstanceOf[typings.pdfkit.pdfkitStrings.cv91]
      
      inline def cv92: typings.pdfkit.pdfkitStrings.cv92 = "cv92".asInstanceOf[typings.pdfkit.pdfkitStrings.cv92]
      
      inline def cv93: typings.pdfkit.pdfkitStrings.cv93 = "cv93".asInstanceOf[typings.pdfkit.pdfkitStrings.cv93]
      
      inline def cv94: typings.pdfkit.pdfkitStrings.cv94 = "cv94".asInstanceOf[typings.pdfkit.pdfkitStrings.cv94]
      
      inline def cv95: typings.pdfkit.pdfkitStrings.cv95 = "cv95".asInstanceOf[typings.pdfkit.pdfkitStrings.cv95]
      
      inline def cv96: typings.pdfkit.pdfkitStrings.cv96 = "cv96".asInstanceOf[typings.pdfkit.pdfkitStrings.cv96]
      
      inline def cv97: typings.pdfkit.pdfkitStrings.cv97 = "cv97".asInstanceOf[typings.pdfkit.pdfkitStrings.cv97]
      
      inline def cv98: typings.pdfkit.pdfkitStrings.cv98 = "cv98".asInstanceOf[typings.pdfkit.pdfkitStrings.cv98]
      
      inline def cv99: typings.pdfkit.pdfkitStrings.cv99 = "cv99".asInstanceOf[typings.pdfkit.pdfkitStrings.cv99]
      
      inline def dist: typings.pdfkit.pdfkitStrings.dist = "dist".asInstanceOf[typings.pdfkit.pdfkitStrings.dist]
      
      inline def dlig: typings.pdfkit.pdfkitStrings.dlig = "dlig".asInstanceOf[typings.pdfkit.pdfkitStrings.dlig]
      
      inline def dnom: typings.pdfkit.pdfkitStrings.dnom = "dnom".asInstanceOf[typings.pdfkit.pdfkitStrings.dnom]
      
      inline def dtls: typings.pdfkit.pdfkitStrings.dtls = "dtls".asInstanceOf[typings.pdfkit.pdfkitStrings.dtls]
      
      inline def expt: typings.pdfkit.pdfkitStrings.expt = "expt".asInstanceOf[typings.pdfkit.pdfkitStrings.expt]
      
      inline def falt: typings.pdfkit.pdfkitStrings.falt = "falt".asInstanceOf[typings.pdfkit.pdfkitStrings.falt]
      
      inline def fin2: typings.pdfkit.pdfkitStrings.fin2 = "fin2".asInstanceOf[typings.pdfkit.pdfkitStrings.fin2]
      
      inline def fin3: typings.pdfkit.pdfkitStrings.fin3 = "fin3".asInstanceOf[typings.pdfkit.pdfkitStrings.fin3]
      
      inline def fina: typings.pdfkit.pdfkitStrings.fina = "fina".asInstanceOf[typings.pdfkit.pdfkitStrings.fina]
      
      inline def flac: typings.pdfkit.pdfkitStrings.flac = "flac".asInstanceOf[typings.pdfkit.pdfkitStrings.flac]
      
      inline def frac: typings.pdfkit.pdfkitStrings.frac = "frac".asInstanceOf[typings.pdfkit.pdfkitStrings.frac]
      
      inline def fwid: typings.pdfkit.pdfkitStrings.fwid = "fwid".asInstanceOf[typings.pdfkit.pdfkitStrings.fwid]
      
      inline def half: typings.pdfkit.pdfkitStrings.half = "half".asInstanceOf[typings.pdfkit.pdfkitStrings.half]
      
      inline def haln: typings.pdfkit.pdfkitStrings.haln = "haln".asInstanceOf[typings.pdfkit.pdfkitStrings.haln]
      
      inline def halt: typings.pdfkit.pdfkitStrings.halt = "halt".asInstanceOf[typings.pdfkit.pdfkitStrings.halt]
      
      inline def hist: typings.pdfkit.pdfkitStrings.hist = "hist".asInstanceOf[typings.pdfkit.pdfkitStrings.hist]
      
      inline def hkna: typings.pdfkit.pdfkitStrings.hkna = "hkna".asInstanceOf[typings.pdfkit.pdfkitStrings.hkna]
      
      inline def hlig: typings.pdfkit.pdfkitStrings.hlig = "hlig".asInstanceOf[typings.pdfkit.pdfkitStrings.hlig]
      
      inline def hngl: typings.pdfkit.pdfkitStrings.hngl = "hngl".asInstanceOf[typings.pdfkit.pdfkitStrings.hngl]
      
      inline def hojo: typings.pdfkit.pdfkitStrings.hojo = "hojo".asInstanceOf[typings.pdfkit.pdfkitStrings.hojo]
      
      inline def hwid: typings.pdfkit.pdfkitStrings.hwid = "hwid".asInstanceOf[typings.pdfkit.pdfkitStrings.hwid]
      
      inline def init: typings.pdfkit.pdfkitStrings.init = "init".asInstanceOf[typings.pdfkit.pdfkitStrings.init]
      
      inline def isol: typings.pdfkit.pdfkitStrings.isol = "isol".asInstanceOf[typings.pdfkit.pdfkitStrings.isol]
      
      inline def ital: typings.pdfkit.pdfkitStrings.ital = "ital".asInstanceOf[typings.pdfkit.pdfkitStrings.ital]
      
      inline def jalt: typings.pdfkit.pdfkitStrings.jalt = "jalt".asInstanceOf[typings.pdfkit.pdfkitStrings.jalt]
      
      inline def jp04: typings.pdfkit.pdfkitStrings.jp04 = "jp04".asInstanceOf[typings.pdfkit.pdfkitStrings.jp04]
      
      inline def jp78: typings.pdfkit.pdfkitStrings.jp78 = "jp78".asInstanceOf[typings.pdfkit.pdfkitStrings.jp78]
      
      inline def jp83: typings.pdfkit.pdfkitStrings.jp83 = "jp83".asInstanceOf[typings.pdfkit.pdfkitStrings.jp83]
      
      inline def jp90: typings.pdfkit.pdfkitStrings.jp90 = "jp90".asInstanceOf[typings.pdfkit.pdfkitStrings.jp90]
      
      inline def kern: typings.pdfkit.pdfkitStrings.kern = "kern".asInstanceOf[typings.pdfkit.pdfkitStrings.kern]
      
      inline def lfbd: typings.pdfkit.pdfkitStrings.lfbd = "lfbd".asInstanceOf[typings.pdfkit.pdfkitStrings.lfbd]
      
      inline def liga: typings.pdfkit.pdfkitStrings.liga = "liga".asInstanceOf[typings.pdfkit.pdfkitStrings.liga]
      
      inline def ljmo: typings.pdfkit.pdfkitStrings.ljmo = "ljmo".asInstanceOf[typings.pdfkit.pdfkitStrings.ljmo]
      
      inline def lnum: typings.pdfkit.pdfkitStrings.lnum = "lnum".asInstanceOf[typings.pdfkit.pdfkitStrings.lnum]
      
      inline def locl: typings.pdfkit.pdfkitStrings.locl = "locl".asInstanceOf[typings.pdfkit.pdfkitStrings.locl]
      
      inline def ltra: typings.pdfkit.pdfkitStrings.ltra = "ltra".asInstanceOf[typings.pdfkit.pdfkitStrings.ltra]
      
      inline def ltrm: typings.pdfkit.pdfkitStrings.ltrm = "ltrm".asInstanceOf[typings.pdfkit.pdfkitStrings.ltrm]
      
      inline def mark: typings.pdfkit.pdfkitStrings.mark = "mark".asInstanceOf[typings.pdfkit.pdfkitStrings.mark]
      
      inline def med2: typings.pdfkit.pdfkitStrings.med2 = "med2".asInstanceOf[typings.pdfkit.pdfkitStrings.med2]
      
      inline def medi: typings.pdfkit.pdfkitStrings.medi = "medi".asInstanceOf[typings.pdfkit.pdfkitStrings.medi]
      
      inline def mgrk: typings.pdfkit.pdfkitStrings.mgrk = "mgrk".asInstanceOf[typings.pdfkit.pdfkitStrings.mgrk]
      
      inline def mkmk: typings.pdfkit.pdfkitStrings.mkmk = "mkmk".asInstanceOf[typings.pdfkit.pdfkitStrings.mkmk]
      
      inline def mset: typings.pdfkit.pdfkitStrings.mset = "mset".asInstanceOf[typings.pdfkit.pdfkitStrings.mset]
      
      inline def nalt: typings.pdfkit.pdfkitStrings.nalt = "nalt".asInstanceOf[typings.pdfkit.pdfkitStrings.nalt]
      
      inline def nlck: typings.pdfkit.pdfkitStrings.nlck = "nlck".asInstanceOf[typings.pdfkit.pdfkitStrings.nlck]
      
      inline def nukt: typings.pdfkit.pdfkitStrings.nukt = "nukt".asInstanceOf[typings.pdfkit.pdfkitStrings.nukt]
      
      inline def numr: typings.pdfkit.pdfkitStrings.numr = "numr".asInstanceOf[typings.pdfkit.pdfkitStrings.numr]
      
      inline def onum: typings.pdfkit.pdfkitStrings.onum = "onum".asInstanceOf[typings.pdfkit.pdfkitStrings.onum]
      
      inline def opbd: typings.pdfkit.pdfkitStrings.opbd = "opbd".asInstanceOf[typings.pdfkit.pdfkitStrings.opbd]
      
      inline def ordn: typings.pdfkit.pdfkitStrings.ordn = "ordn".asInstanceOf[typings.pdfkit.pdfkitStrings.ordn]
      
      inline def ornm: typings.pdfkit.pdfkitStrings.ornm = "ornm".asInstanceOf[typings.pdfkit.pdfkitStrings.ornm]
      
      inline def palt: typings.pdfkit.pdfkitStrings.palt = "palt".asInstanceOf[typings.pdfkit.pdfkitStrings.palt]
      
      inline def pcap: typings.pdfkit.pdfkitStrings.pcap = "pcap".asInstanceOf[typings.pdfkit.pdfkitStrings.pcap]
      
      inline def pkna: typings.pdfkit.pdfkitStrings.pkna = "pkna".asInstanceOf[typings.pdfkit.pdfkitStrings.pkna]
      
      inline def pnum: typings.pdfkit.pdfkitStrings.pnum = "pnum".asInstanceOf[typings.pdfkit.pdfkitStrings.pnum]
      
      inline def pref: typings.pdfkit.pdfkitStrings.pref = "pref".asInstanceOf[typings.pdfkit.pdfkitStrings.pref]
      
      inline def pres: typings.pdfkit.pdfkitStrings.pres = "pres".asInstanceOf[typings.pdfkit.pdfkitStrings.pres]
      
      inline def pstf: typings.pdfkit.pdfkitStrings.pstf = "pstf".asInstanceOf[typings.pdfkit.pdfkitStrings.pstf]
      
      inline def psts: typings.pdfkit.pdfkitStrings.psts = "psts".asInstanceOf[typings.pdfkit.pdfkitStrings.psts]
      
      inline def pwid: typings.pdfkit.pdfkitStrings.pwid = "pwid".asInstanceOf[typings.pdfkit.pdfkitStrings.pwid]
      
      inline def qwid: typings.pdfkit.pdfkitStrings.qwid = "qwid".asInstanceOf[typings.pdfkit.pdfkitStrings.qwid]
      
      inline def rand: typings.pdfkit.pdfkitStrings.rand = "rand".asInstanceOf[typings.pdfkit.pdfkitStrings.rand]
      
      inline def rclt: typings.pdfkit.pdfkitStrings.rclt = "rclt".asInstanceOf[typings.pdfkit.pdfkitStrings.rclt]
      
      inline def rkrf: typings.pdfkit.pdfkitStrings.rkrf = "rkrf".asInstanceOf[typings.pdfkit.pdfkitStrings.rkrf]
      
      inline def rlig: typings.pdfkit.pdfkitStrings.rlig = "rlig".asInstanceOf[typings.pdfkit.pdfkitStrings.rlig]
      
      inline def rphf: typings.pdfkit.pdfkitStrings.rphf = "rphf".asInstanceOf[typings.pdfkit.pdfkitStrings.rphf]
      
      inline def rtbd: typings.pdfkit.pdfkitStrings.rtbd = "rtbd".asInstanceOf[typings.pdfkit.pdfkitStrings.rtbd]
      
      inline def rtla: typings.pdfkit.pdfkitStrings.rtla = "rtla".asInstanceOf[typings.pdfkit.pdfkitStrings.rtla]
      
      inline def rtlm: typings.pdfkit.pdfkitStrings.rtlm = "rtlm".asInstanceOf[typings.pdfkit.pdfkitStrings.rtlm]
      
      inline def ruby: typings.pdfkit.pdfkitStrings.ruby = "ruby".asInstanceOf[typings.pdfkit.pdfkitStrings.ruby]
      
      inline def rvrn: typings.pdfkit.pdfkitStrings.rvrn = "rvrn".asInstanceOf[typings.pdfkit.pdfkitStrings.rvrn]
      
      inline def salt: typings.pdfkit.pdfkitStrings.salt = "salt".asInstanceOf[typings.pdfkit.pdfkitStrings.salt]
      
      inline def sinf: typings.pdfkit.pdfkitStrings.sinf = "sinf".asInstanceOf[typings.pdfkit.pdfkitStrings.sinf]
      
      inline def size: typings.pdfkit.pdfkitStrings.size = "size".asInstanceOf[typings.pdfkit.pdfkitStrings.size]
      
      inline def smcp: typings.pdfkit.pdfkitStrings.smcp = "smcp".asInstanceOf[typings.pdfkit.pdfkitStrings.smcp]
      
      inline def smpl: typings.pdfkit.pdfkitStrings.smpl = "smpl".asInstanceOf[typings.pdfkit.pdfkitStrings.smpl]
      
      inline def ss01: typings.pdfkit.pdfkitStrings.ss01 = "ss01".asInstanceOf[typings.pdfkit.pdfkitStrings.ss01]
      
      inline def ss02: typings.pdfkit.pdfkitStrings.ss02 = "ss02".asInstanceOf[typings.pdfkit.pdfkitStrings.ss02]
      
      inline def ss03: typings.pdfkit.pdfkitStrings.ss03 = "ss03".asInstanceOf[typings.pdfkit.pdfkitStrings.ss03]
      
      inline def ss04: typings.pdfkit.pdfkitStrings.ss04 = "ss04".asInstanceOf[typings.pdfkit.pdfkitStrings.ss04]
      
      inline def ss05: typings.pdfkit.pdfkitStrings.ss05 = "ss05".asInstanceOf[typings.pdfkit.pdfkitStrings.ss05]
      
      inline def ss06: typings.pdfkit.pdfkitStrings.ss06 = "ss06".asInstanceOf[typings.pdfkit.pdfkitStrings.ss06]
      
      inline def ss07: typings.pdfkit.pdfkitStrings.ss07 = "ss07".asInstanceOf[typings.pdfkit.pdfkitStrings.ss07]
      
      inline def ss08: typings.pdfkit.pdfkitStrings.ss08 = "ss08".asInstanceOf[typings.pdfkit.pdfkitStrings.ss08]
      
      inline def ss09: typings.pdfkit.pdfkitStrings.ss09 = "ss09".asInstanceOf[typings.pdfkit.pdfkitStrings.ss09]
      
      inline def ss10: typings.pdfkit.pdfkitStrings.ss10 = "ss10".asInstanceOf[typings.pdfkit.pdfkitStrings.ss10]
      
      inline def ss11: typings.pdfkit.pdfkitStrings.ss11 = "ss11".asInstanceOf[typings.pdfkit.pdfkitStrings.ss11]
      
      inline def ss12: typings.pdfkit.pdfkitStrings.ss12 = "ss12".asInstanceOf[typings.pdfkit.pdfkitStrings.ss12]
      
      inline def ss13: typings.pdfkit.pdfkitStrings.ss13 = "ss13".asInstanceOf[typings.pdfkit.pdfkitStrings.ss13]
      
      inline def ss14: typings.pdfkit.pdfkitStrings.ss14 = "ss14".asInstanceOf[typings.pdfkit.pdfkitStrings.ss14]
      
      inline def ss15: typings.pdfkit.pdfkitStrings.ss15 = "ss15".asInstanceOf[typings.pdfkit.pdfkitStrings.ss15]
      
      inline def ss16: typings.pdfkit.pdfkitStrings.ss16 = "ss16".asInstanceOf[typings.pdfkit.pdfkitStrings.ss16]
      
      inline def ss17: typings.pdfkit.pdfkitStrings.ss17 = "ss17".asInstanceOf[typings.pdfkit.pdfkitStrings.ss17]
      
      inline def ss18: typings.pdfkit.pdfkitStrings.ss18 = "ss18".asInstanceOf[typings.pdfkit.pdfkitStrings.ss18]
      
      inline def ss19: typings.pdfkit.pdfkitStrings.ss19 = "ss19".asInstanceOf[typings.pdfkit.pdfkitStrings.ss19]
      
      inline def ss20: typings.pdfkit.pdfkitStrings.ss20 = "ss20".asInstanceOf[typings.pdfkit.pdfkitStrings.ss20]
      
      inline def ssty: typings.pdfkit.pdfkitStrings.ssty = "ssty".asInstanceOf[typings.pdfkit.pdfkitStrings.ssty]
      
      inline def stch: typings.pdfkit.pdfkitStrings.stch = "stch".asInstanceOf[typings.pdfkit.pdfkitStrings.stch]
      
      inline def subs: typings.pdfkit.pdfkitStrings.subs = "subs".asInstanceOf[typings.pdfkit.pdfkitStrings.subs]
      
      inline def sups: typings.pdfkit.pdfkitStrings.sups = "sups".asInstanceOf[typings.pdfkit.pdfkitStrings.sups]
      
      inline def swsh: typings.pdfkit.pdfkitStrings.swsh = "swsh".asInstanceOf[typings.pdfkit.pdfkitStrings.swsh]
      
      inline def titl: typings.pdfkit.pdfkitStrings.titl = "titl".asInstanceOf[typings.pdfkit.pdfkitStrings.titl]
      
      inline def tjmo: typings.pdfkit.pdfkitStrings.tjmo = "tjmo".asInstanceOf[typings.pdfkit.pdfkitStrings.tjmo]
      
      inline def tnam: typings.pdfkit.pdfkitStrings.tnam = "tnam".asInstanceOf[typings.pdfkit.pdfkitStrings.tnam]
      
      inline def tnum: typings.pdfkit.pdfkitStrings.tnum = "tnum".asInstanceOf[typings.pdfkit.pdfkitStrings.tnum]
      
      inline def trad: typings.pdfkit.pdfkitStrings.trad = "trad".asInstanceOf[typings.pdfkit.pdfkitStrings.trad]
      
      inline def twid: typings.pdfkit.pdfkitStrings.twid = "twid".asInstanceOf[typings.pdfkit.pdfkitStrings.twid]
      
      inline def unic: typings.pdfkit.pdfkitStrings.unic = "unic".asInstanceOf[typings.pdfkit.pdfkitStrings.unic]
      
      inline def valt: typings.pdfkit.pdfkitStrings.valt = "valt".asInstanceOf[typings.pdfkit.pdfkitStrings.valt]
      
      inline def vatu: typings.pdfkit.pdfkitStrings.vatu = "vatu".asInstanceOf[typings.pdfkit.pdfkitStrings.vatu]
      
      inline def vert: typings.pdfkit.pdfkitStrings.vert = "vert".asInstanceOf[typings.pdfkit.pdfkitStrings.vert]
      
      inline def vhal: typings.pdfkit.pdfkitStrings.vhal = "vhal".asInstanceOf[typings.pdfkit.pdfkitStrings.vhal]
      
      inline def vjmo: typings.pdfkit.pdfkitStrings.vjmo = "vjmo".asInstanceOf[typings.pdfkit.pdfkitStrings.vjmo]
      
      inline def vkna: typings.pdfkit.pdfkitStrings.vkna = "vkna".asInstanceOf[typings.pdfkit.pdfkitStrings.vkna]
      
      inline def vkrn: typings.pdfkit.pdfkitStrings.vkrn = "vkrn".asInstanceOf[typings.pdfkit.pdfkitStrings.vkrn]
      
      inline def vpal: typings.pdfkit.pdfkitStrings.vpal = "vpal".asInstanceOf[typings.pdfkit.pdfkitStrings.vpal]
      
      inline def vrt2: typings.pdfkit.pdfkitStrings.vrt2 = "vrt2".asInstanceOf[typings.pdfkit.pdfkitStrings.vrt2]
      
      inline def vrtr: typings.pdfkit.pdfkitStrings.vrtr = "vrtr".asInstanceOf[typings.pdfkit.pdfkitStrings.vrtr]
      
      inline def zero: typings.pdfkit.pdfkitStrings.zero = "zero".asInstanceOf[typings.pdfkit.pdfkitStrings.zero]
    }
    
    @js.native
    trait PDFAnnotation extends StObject {
      
      def annotate(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def goTo(x: Double, y: Double, w: Double, h: Double, name: String): this.type = js.native
      def goTo(x: Double, y: Double, w: Double, h: Double, name: String, options: AnnotationOption): this.type = js.native
      
      def highlight(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def highlight(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
      def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double, option: AnnotationOption): this.type = js.native
      
      def link(x: Double, y: Double, w: Double, h: Double, url: String): this.type = js.native
      def link(x: Double, y: Double, w: Double, h: Double, url: String, option: AnnotationOption): this.type = js.native
      
      def note(x: Double, y: Double, w: Double, h: Double, content: String): this.type = js.native
      def note(x: Double, y: Double, w: Double, h: Double, content: String, option: AnnotationOption): this.type = js.native
      
      def rectAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def rectAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def strike(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def strike(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String): this.type = js.native
      def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String, option: AnnotationOption): this.type = js.native
      
      def underline(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def underline(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    }
    
    @js.native
    trait PDFColor extends StObject {
      
      def fillColor(color: ColorValue): this.type = js.native
      def fillColor(color: ColorValue, opacity: Double): this.type = js.native
      
      def fillOpacity(opacity: Double): this.type = js.native
      
      def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
      
      def opacity(opacity: Double): this.type = js.native
      
      def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
      
      def strokeColor(color: ColorValue): this.type = js.native
      def strokeColor(color: ColorValue, opacity: Double): this.type = js.native
      
      def strokeOpacity(opacity: Double): this.type = js.native
    }
    
    @js.native
    trait PDFFont extends StObject {
      
      def currentLineHeight(): Double = js.native
      def currentLineHeight(includeGap: Boolean): Double = js.native
      
      def font(buffer: Buffer): this.type = js.native
      def font(src: String): this.type = js.native
      def font(src: String, family: String): this.type = js.native
      def font(src: String, family: String, size: Double): this.type = js.native
      def font(src: String, family: Unit, size: Double): this.type = js.native
      
      def fontSize(size: Double): this.type = js.native
      
      def registerFont(name: String): this.type = js.native
      def registerFont(name: String, src: Unit, family: String): this.type = js.native
      def registerFont(name: String, src: PDFFontSource): this.type = js.native
      def registerFont(name: String, src: PDFFontSource, family: String): this.type = js.native
    }
    
    type PDFFontSource = String | Buffer | Uint8Array | ArrayBuffer
    
    @js.native
    trait PDFImage extends StObject {
      
      /**
        * Draw an image in PDFKit document.
        */
      def image(src: js.Any): this.type = js.native
      def image(src: js.Any, options: ImageOption): this.type = js.native
      def image(src: js.Any, x: Double): this.type = js.native
      def image(src: js.Any, x: Double, y: Double): this.type = js.native
      def image(src: js.Any, x: Double, y: Double, options: ImageOption): this.type = js.native
      def image(src: js.Any, x: Double, y: Unit, options: ImageOption): this.type = js.native
      def image(src: js.Any, x: Unit, y: Double): this.type = js.native
      def image(src: js.Any, x: Unit, y: Double, options: ImageOption): this.type = js.native
      def image(src: js.Any, x: Unit, y: Unit, options: ImageOption): this.type = js.native
    }
    
    @js.native
    trait PDFText extends StObject {
      
      def heightOfString(text: String): Double = js.native
      def heightOfString(text: String, options: TextOptions): Double = js.native
      
      def lineGap(lineGap: Double): this.type = js.native
      
      def list(list: js.Array[String | js.Any]): this.type = js.native
      def list(list: js.Array[String | js.Any], options: TextOptions): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Double): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Double, y: Double): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Double, y: Double, options: TextOptions): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Double, y: Unit, options: TextOptions): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Unit, y: Double): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Unit, y: Double, options: TextOptions): this.type = js.native
      def list(list: js.Array[String | js.Any], x: Unit, y: Unit, options: TextOptions): this.type = js.native
      
      def moveDown(): this.type = js.native
      def moveDown(line: Double): this.type = js.native
      
      def moveUp(): this.type = js.native
      def moveUp(line: Double): this.type = js.native
      
      def text(text: String): this.type = js.native
      def text(text: String, options: TextOptions): this.type = js.native
      def text(text: String, x: Double): this.type = js.native
      def text(text: String, x: Double, y: Double): this.type = js.native
      def text(text: String, x: Double, y: Double, options: TextOptions): this.type = js.native
      def text(text: String, x: Double, y: Unit, options: TextOptions): this.type = js.native
      def text(text: String, x: Unit, y: Double): this.type = js.native
      def text(text: String, x: Unit, y: Double, options: TextOptions): this.type = js.native
      def text(text: String, x: Unit, y: Unit, options: TextOptions): this.type = js.native
      
      def widthOfString(text: String): Double = js.native
      def widthOfString(text: String, options: TextOptions): Double = js.native
    }
    
    @js.native
    trait PDFVector extends StObject {
      
      def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): this.type = js.native
      
      def circle(x: Double, y: Double, raduis: Double): this.type = js.native
      
      def clip(): this.type = js.native
      def clip(rule: RuleValue): this.type = js.native
      
      def closePath(): this.type = js.native
      
      def dash(length: Double, option: js.Any): this.type = js.native
      
      def ellipse(x: Double, y: Double, r1: Double): this.type = js.native
      def ellipse(x: Double, y: Double, r1: Double, r2: Double): this.type = js.native
      
      def fill(): this.type = js.native
      def fill(color: Unit, rule: RuleValue): this.type = js.native
      def fill(color: ColorValue): this.type = js.native
      def fill(color: ColorValue, rule: RuleValue): this.type = js.native
      def fill(rule: RuleValue): this.type = js.native
      
      def fillAndStroke(): this.type = js.native
      def fillAndStroke(fillColor: Unit, strokeColor: Unit, rule: RuleValue): this.type = js.native
      def fillAndStroke(fillColor: Unit, strokeColor: ColorValue): this.type = js.native
      def fillAndStroke(fillColor: Unit, strokeColor: ColorValue, rule: RuleValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue, rule: RuleValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue, strokeColor: Unit, rule: RuleValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue, rule: RuleValue): this.type = js.native
      def fillAndStroke(rule: RuleValue): this.type = js.native
      
      def lineCap(c: String): this.type = js.native
      
      def lineJoin(j: String): this.type = js.native
      
      def lineTo(x: Double, y: Double): this.type = js.native
      
      def lineWidth(w: Double): this.type = js.native
      
      def miterLimit(m: js.Any): this.type = js.native
      
      def moveTo(x: Double, y: Double): this.type = js.native
      
      def path(path: String): this.type = js.native
      
      def polygon(points: js.Array[Double]*): this.type = js.native
      
      def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): this.type = js.native
      
      def rect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      
      def restore(): this.type = js.native
      
      def rotate(angle: Double): this.type = js.native
      def rotate(angle: Double, options: Origin): this.type = js.native
      
      def roundedRect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def roundedRect(x: Double, y: Double, w: Double, h: Double, r: Double): this.type = js.native
      
      def save(): this.type = js.native
      
      def scale(xFactor: Double): this.type = js.native
      def scale(xFactor: Double, yFactor: Double): this.type = js.native
      def scale(xFactor: Double, yFactor: Double, options: Origin): this.type = js.native
      def scale(xFactor: Double, yFactor: Unit, options: Origin): this.type = js.native
      
      def stroke(): this.type = js.native
      def stroke(color: ColorValue): this.type = js.native
      
      def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): this.type = js.native
      
      def translate(x: Double, y: Double): this.type = js.native
      
      def undash(): this.type = js.native
    }
    
    // The winding / filling rule accepted by PDFKit:
    /* Rewritten from type alias, can be one of: 
      - typings.pdfkit.pdfkitStrings.`even-odd`
      - typings.pdfkit.pdfkitStrings.evenodd
      - typings.pdfkit.pdfkitStrings.`non-zero`
      - typings.pdfkit.pdfkitStrings.nonzero
    */
    trait RuleValue extends StObject
    object RuleValue {
      
      inline def `even-odd`: typings.pdfkit.pdfkitStrings.`even-odd` = "even-odd".asInstanceOf[typings.pdfkit.pdfkitStrings.`even-odd`]
      
      inline def evenodd: typings.pdfkit.pdfkitStrings.evenodd = "evenodd".asInstanceOf[typings.pdfkit.pdfkitStrings.evenodd]
      
      inline def `non-zero`: typings.pdfkit.pdfkitStrings.`non-zero` = "non-zero".asInstanceOf[typings.pdfkit.pdfkitStrings.`non-zero`]
      
      inline def nonzero: typings.pdfkit.pdfkitStrings.nonzero = "nonzero".asInstanceOf[typings.pdfkit.pdfkitStrings.nonzero]
    }
    
    trait TextOptions extends StObject {
      
      /** the alignment of the text (center, justify, left, right) */
      //TODO check this
      var align: js.UndefOr[center | justify | left | right | String] = js.undefined
      
      /** the vertical alignment of the text with respect to its insertion point */
      var baseline: js.UndefOr[
            Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
          ] = js.undefined
      
      /** the amount of space between each character in the text */
      var characterSpacing: js.UndefOr[Double] = js.undefined
      
      /** the amount of space between each column (1/4 inch by default) */
      var columnGap: js.UndefOr[Double] = js.undefined
      
      /**  the number of columns to flow the text into */
      var columns: js.UndefOr[Double] = js.undefined
      
      /** whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
      var continued: js.UndefOr[Boolean] = js.undefined
      
      /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
      var ellipsis: js.UndefOr[Boolean | String] = js.undefined
      
      /** an array of OpenType feature tags to apply. If not provided, a set of defaults is used. */
      var features: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
      
      /** whether to fill the text (true by default) */
      var fill: js.UndefOr[Boolean] = js.undefined
      
      /**  The maximum height that text should be clipped to */
      var height: js.UndefOr[Double] = js.undefined
      
      /** The amount in PDF points (72 per inch) to indent each paragraph of text */
      var indent: js.UndefOr[Double] = js.undefined
      
      /**  Set to false to disable line wrapping all together */
      var lineBreak: js.UndefOr[Boolean] = js.undefined
      
      /** the amount of space between each line of text */
      var lineGap: js.UndefOr[Double] = js.undefined
      
      /** A URL to link this text to (shortcut to create an annotation) */
      var link: js.UndefOr[String] = js.undefined
      
      /** whether to slant the text (angle in degrees or true) */
      var oblique: js.UndefOr[Boolean | Double] = js.undefined
      
      /** the amount of space between each paragraph of text */
      var paragraphGap: js.UndefOr[Double] = js.undefined
      
      /** whether to strike out the text */
      var strike: js.UndefOr[Boolean] = js.undefined
      
      /**  whether to stroke the text */
      var stroke: js.UndefOr[Boolean] = js.undefined
      
      /** whether to underline the text */
      var underline: js.UndefOr[Boolean] = js.undefined
      
      /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
      var width: js.UndefOr[Double] = js.undefined
      
      /** the amount of space between each word in the text */
      var wordSpacing: js.UndefOr[Double] = js.undefined
    }
    object TextOptions {
      
      inline def apply(): TextOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextOptions]
      }
      
      extension [Self <: TextOptions](x: Self) {
        
        inline def setAlign(value: center | justify | left | right | String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setBaseline(
          value: Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
        ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
        
        inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
        
        inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
        
        inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
        
        inline def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
        
        inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
        
        inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setContinued(value: Boolean): Self = StObject.set(x, "continued", value.asInstanceOf[js.Any])
        
        inline def setContinuedUndefined: Self = StObject.set(x, "continued", js.undefined)
        
        inline def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
        
        inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
        
        inline def setFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        inline def setFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
        
        inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
        
        inline def setLineBreak(value: Boolean): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
        
        inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
        
        inline def setLineGap(value: Double): Self = StObject.set(x, "lineGap", value.asInstanceOf[js.Any])
        
        inline def setLineGapUndefined: Self = StObject.set(x, "lineGap", js.undefined)
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setOblique(value: Boolean | Double): Self = StObject.set(x, "oblique", value.asInstanceOf[js.Any])
        
        inline def setObliqueUndefined: Self = StObject.set(x, "oblique", js.undefined)
        
        inline def setParagraphGap(value: Double): Self = StObject.set(x, "paragraphGap", value.asInstanceOf[js.Any])
        
        inline def setParagraphGapUndefined: Self = StObject.set(x, "paragraphGap", js.undefined)
        
        inline def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
        
        inline def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
        
        inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
        
        inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
        
        inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
        
        inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
        
        inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      }
    }
  }
  
  /**
    * PDFKit data
    */
  @js.native
  trait PDFData
    extends StObject
       with Instantiable1[/* data */ js.Array[js.Any], PDFData] {
    
    def byteAt(index: Double): js.Any = js.native
    
    def read(length: Double): js.Array[js.Any] = js.native
    
    def readBool(): Boolean = js.native
    
    def readByte(): js.Any = js.native
    
    def readInt(): Double = js.native
    
    def readInt16(): Double = js.native
    
    def readInt32(): Double = js.native
    
    def readLongLong(): Double = js.native
    
    def readShort(): Double = js.native
    
    def readString(length: Double): String = js.native
    
    def readUInt16(): Double = js.native
    
    def readUInt32(): Double = js.native
    
    def slice(start: Double, end: Double): js.Array[js.Any] = js.native
    
    def stringAt(pos: Double, length: Double): String = js.native
    
    def write(bytes: js.Array[js.Any]): Unit = js.native
    
    def writeBool(`val`: Boolean): Boolean = js.native
    
    def writeByte(byte: js.Any): Unit = js.native
    
    def writeInt(`val`: Double): Unit = js.native
    
    def writeInt16(`val`: Double): Unit = js.native
    
    def writeInt32(`val`: Double): Unit = js.native
    
    def writeLongLong(`val`: Double): Unit = js.native
    
    def writeShort(`val`: Double): Unit = js.native
    
    def writeString(`val`: String): Unit = js.native
    
    def writeUInt16(`val`: Double): Unit = js.native
    
    def writeUInt32(`val`: Double): Unit = js.native
  }
  
  @js.native
  trait PDFDocument
    extends StObject
       with ReadableStream
       with PDFAnnotation
       with PDFColor
       with PDFImage
       with PDFText
       with PDFVector
       with PDFFont
       with Instantiable0[PDFDocument]
       with Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
    
    def addContent(data: js.Any): PDFDocument = js.native
    
    def addPage(): PDFDocument = js.native
    def addPage(options: PDFDocumentOptions): PDFDocument = js.native
    
    def bufferedPageRange(): Count = js.native
    
    /**
      * Wheter streams should be compressed
      */
    var compress: Boolean = js.native
    
    def end(): Unit = js.native
    
    def flushPages(): Unit = js.native
    
    /**
      * PDF document Metadata
      */
    var info: DocumentInfo = js.native
    
    /**
      * Options for the document
      */
    var options: PDFDocumentOptions = js.native
    
    /**
      * Deprecated. Throws exception
      */
    def output(fn: js.Any): Unit = js.native
    
    /**
      * Represent the current page.
      */
    var page: PDFPage = js.native
    
    def ref(data: js.Object): PDFKitReference = js.native
    
    def switchToPage(): PDFPage = js.native
    def switchToPage(n: Double): PDFPage = js.native
    
    /**
      * PDF Version
      */
    var version: Double = js.native
    
    /**
      * Deprecated
      */
    def write(fileName: String, fn: js.Any): Unit = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  trait PDFDocumentOptions extends StObject {
    
    var autoFirstPage: js.UndefOr[Boolean] = js.undefined
    
    var bufferPages: js.UndefOr[Boolean] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var info: js.UndefOr[DocumentInfo] = js.undefined
    
    var layout: js.UndefOr[portrait | landscape] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var margins: js.UndefOr[Bottom] = js.undefined
    
    var ownerPassword: js.UndefOr[String] = js.undefined
    
    var pdfVersion: js.UndefOr[`1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`] = js.undefined
    
    var permissions: js.UndefOr[DocumentPermissions] = js.undefined
    
    var size: js.UndefOr[js.Array[Double] | String] = js.undefined
    
    var userPassword: js.UndefOr[String] = js.undefined
  }
  object PDFDocumentOptions {
    
    inline def apply(): PDFDocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFDocumentOptions]
    }
    
    extension [Self <: PDFDocumentOptions](x: Self) {
      
      inline def setAutoFirstPage(value: Boolean): Self = StObject.set(x, "autoFirstPage", value.asInstanceOf[js.Any])
      
      inline def setAutoFirstPageUndefined: Self = StObject.set(x, "autoFirstPage", js.undefined)
      
      inline def setBufferPages(value: Boolean): Self = StObject.set(x, "bufferPages", value.asInstanceOf[js.Any])
      
      inline def setBufferPagesUndefined: Self = StObject.set(x, "bufferPages", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setInfo(value: DocumentInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLayout(value: portrait | landscape): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
      
      inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
      
      inline def setPdfVersion(value: `1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`): Self = StObject.set(x, "pdfVersion", value.asInstanceOf[js.Any])
      
      inline def setPdfVersionUndefined: Self = StObject.set(x, "pdfVersion", js.undefined)
      
      inline def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    }
  }
  
  @js.native
  trait PDFGradient
    extends StObject
       with Instantiable1[/* document */ js.Any, PDFGradient] {
    
    @JSName("apply")
    def apply(): Unit = js.native
    
    def embed(): Unit = js.native
    
    def stop(pos: Double): PDFGradient = js.native
    def stop(pos: Double, color: String): PDFGradient = js.native
    def stop(pos: Double, color: String, opacity: Double): PDFGradient = js.native
    def stop(pos: Double, color: Unit, opacity: Double): PDFGradient = js.native
    def stop(pos: Double, color: PDFGradient): PDFGradient = js.native
    def stop(pos: Double, color: PDFGradient, opacity: Double): PDFGradient = js.native
  }
  
  /** PDFReference - represents a reference to another object in the PDF object heirarchy */
  trait PDFKitReference extends StObject {
    
    var chunks: js.Array[js.Any]
    
    var compress: Boolean
    
    var data: Annots
    
    var deflate: js.Any
    
    var document: PDFDocument
    
    def end(chunk: js.Any): Unit
    
    var gen: Double
    
    var id: Double
    
    def initDeflate(): Unit
    
    var uncompressedLength: Double
    
    def write(chunk: js.Any): Unit
  }
  object PDFKitReference {
    
    inline def apply(
      chunks: js.Array[js.Any],
      compress: Boolean,
      data: Annots,
      deflate: js.Any,
      document: PDFDocument,
      end: js.Any => Unit,
      gen: Double,
      id: Double,
      initDeflate: () => Unit,
      uncompressedLength: Double,
      write: js.Any => Unit
    ): PDFKitReference = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deflate = deflate.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), gen = gen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initDeflate = js.Any.fromFunction0(initDeflate), uncompressedLength = uncompressedLength.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[PDFKitReference]
    }
    
    extension [Self <: PDFKitReference](x: Self) {
      
      inline def setChunks(value: js.Array[js.Any]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: js.Any*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setData(value: Annots): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDeflate(value: js.Any): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: PDFDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: js.Any => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setGen(value: Double): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitDeflate(value: () => Unit): Self = StObject.set(x, "initDeflate", js.Any.fromFunction0(value))
      
      inline def setUncompressedLength(value: Double): Self = StObject.set(x, "uncompressedLength", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PDFLinearGradient
    extends StObject
       with PDFGradient
       with Instantiable5[
          /* document */ js.Any, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          /* x2 */ Double, 
          /* y2 */ Double, 
          PDFLinearGradient
        ] {
    
    def opacityGradient(): PDFLinearGradient = js.native
    
    def shader(fn: js.Function0[js.Any]): js.Any = js.native
  }
  
  /**
    * Represent a single page in the PDF document
    */
  trait PDFPage extends StObject {
    
    var annotations: js.Any
    
    var content: PDFKitReference
    
    /**
      * The page dictionnary
      */
    var dictionary: PDFKitReference
    
    var document: PDFDocument
    
    def end(): Unit
    
    var ext_gstates: js.Any
    
    var fonts: js.Any
    
    var height: Double
    
    var layout: String
    
    var margins: Bottom
    
    def maxY(): Double
    
    var patterns: js.Any
    
    var size: String
    
    var width: Double
    
    def write(chunk: js.Any): Unit
    
    var xobjects: js.Any
  }
  object PDFPage {
    
    inline def apply(
      annotations: js.Any,
      content: PDFKitReference,
      dictionary: PDFKitReference,
      document: PDFDocument,
      end: () => Unit,
      ext_gstates: js.Any,
      fonts: js.Any,
      height: Double,
      layout: String,
      margins: Bottom,
      maxY: () => Double,
      patterns: js.Any,
      size: String,
      width: Double,
      write: js.Any => Unit,
      xobjects: js.Any
    ): PDFPage = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxY = js.Any.fromFunction0(maxY), patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), xobjects = xobjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFPage]
    }
    
    extension [Self <: PDFPage](x: Self) {
      
      inline def setAnnotations(value: js.Any): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setContent(value: PDFKitReference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDictionary(value: PDFKitReference): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: PDFDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setExt_gstates(value: js.Any): Self = StObject.set(x, "ext_gstates", value.asInstanceOf[js.Any])
      
      inline def setFonts(value: js.Any): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: () => Double): Self = StObject.set(x, "maxY", js.Any.fromFunction0(value))
      
      inline def setPatterns(value: js.Any): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setXobjects(value: js.Any): Self = StObject.set(x, "xobjects", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PDFRadialGradient
    extends StObject
       with PDFGradient
       with Instantiable5[
          /* document */ js.Any, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          /* x2 */ Double, 
          /* y2 */ Double, 
          PDFRadialGradient
        ] {
    
    def opacityGradient(): PDFRadialGradient = js.native
    
    def shader(fn: js.Function0[js.Any]): js.Any = js.native
  }
}
